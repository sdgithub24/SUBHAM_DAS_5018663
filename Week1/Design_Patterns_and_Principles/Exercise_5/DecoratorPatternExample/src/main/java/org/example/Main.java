package org.example;

interface Notifier {
    public void send();
}

class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Email Notifier");
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;


    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }


    public void send() {
        notifier.send();
    }
}


class SMSNotifierDecorator extends NotifierDecorator{

    public SMSNotifierDecorator(Notifier notifier)
    {
        super(notifier);
    }

    @Override public void send()
    {
        notifier.send();
        Method(notifier);
    }

    private void Method(Notifier notifier)
    {

        System.out.println("SMS");
    }
}




class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier)
    {
        super(notifier);
    }

    @Override public void send()
    {
        notifier.send();
        Method(notifier);
    }

    private void Method(Notifier notifier)
    {

        System.out.println("Slack");
    }

}


public class Main {
    public static void main(String[] args) {


        Notifier notifieremail = new SMSNotifierDecorator(new EmailNotifier());


        notifieremail.send();



    }
}