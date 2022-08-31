package designpatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer");
        jobSite.addVacancy("Middle Java Developer");

        Observer firstSubscriber = new Subscriber("Maksim");
        Observer secondSubscriber = new Subscriber("Marina");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Senior Java Developer");
        jobSite.removeVacancy("Junior Java Developer");
    }
}
