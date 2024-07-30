package org.example;

interface Image{
    void display();
}

class RealImage implements Image {
    private String imgname;

    public RealImage(String imgname) {
        this.imgname = imgname;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image: " + imgname);
    }

    public void display() {
        System.out.println("Displaying image: " + imgname);
    }
}


class ProxyImage implements Image {
    private RealImage Image;
    private String imgname;

    public ProxyImage(String imgname) {
        this.imgname = imgname;
    }

    public void display() {
        if (Image == null) {
            Image = new RealImage(imgname);
        }
        Image.display();
    }
}


public class Main {
    public static void main(String[] args) {

        Image image = new ProxyImage("Exercise6.jpg");

        // Image will be loaded from disk only when display() is called
        image.display();

        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();



    }
}