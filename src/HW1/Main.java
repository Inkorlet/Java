package HW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 281, Arrays.asList("Author1", "Author2"), "Fiction");
        Book book2 = new Book("Book2", 328, Arrays.asList("Author1", "Author2"), "Dystopian");
        Book book3 = new Book("Book3", 180, Arrays.asList("Author1", "Author2"), "Classic");
        Book book4 = new Book("Book4", 635, Arrays.asList("Author1", "Author2"), "Adventure");
        Book book5 = new Book("Book5", 310, Arrays.asList("Author1", "Author2"), "Fantasy");

        ArrayList<Book> books = new ArrayList<>();
//        Чомусь в мене не працює так як на відео - 'ArrayList arrayList = new ArrayList();'
//        Потрібно було добавити <>, не розумію чому
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Authors: " + book.getAuthors());
            System.out.println("Genre: " + book.getGenre());
            System.out.println();
        }
        Car car1 = new Car("Model1", 150, 2000, true);
        Car car2 = new Car("Model2", 180, 2200, false);
        Car car3 = new Car("Model3", 200, 2500, true);
        Car car4 = new Car("Model4", 220, 2800, true);
        Car car5 = new Car("Model5", 240, 3000, false);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Power: " + car.getPower());
            System.out.println("Engine Volume: " + car.getVolumeEngine());
            System.out.println("Turbo: " + car.getTurbo());
            System.out.println();
        }
        Dog dog1 = new Dog("Buddy", 3, "Labrador");
        Dog dog2 = new Dog("Max", 5, "German Shepherd");
        Dog dog3 = new Dog("Bella", 2, "Beagle");
        Dog dog4 = new Dog("Lucy", 4, "Poodle");
        Dog dog5 = new Dog("Daisy", 6, "Bulldog");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for (Dog dog : dogs) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Age: " + dog.getAge() + " years");
            System.out.println("Breed: " + dog.getPoroda());
            System.out.println();
        }
        Posts post1 = new Posts(1, 1, "lorem 1", "lorem body 1");
        Posts post2 = new Posts(2, 2, "lorem 2", "lorem body 2");
        Posts post3 = new Posts(3, 3, "lorem 3", "lorem body 3");
        Posts post4 = new Posts(4, 4, "lorem 4", "lorem body 4");
        Posts post5 = new Posts(5, 5, "lorem 5", "lorem body 5");

        ArrayList<Posts> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

        for (Posts post : posts) {
            System.out.println("User ID: " + post.getUserId());
            System.out.println("ID: " + post.getId());
            System.out.println("Title: " + post.getTitle());
            System.out.println("Body: " + post.getBody());
            System.out.println();
        }
        Comment comment1 = new Comment(1, 1, "name 1", "nobody1@gmail.com", "lorem body 1");
        Comment comment2 = new Comment(1, 2, "name 2", "nobody2@gmail.com", "lorem body 2");
        Comment comment3 = new Comment(1, 3, "name 3", "nobody3@gmail.com", "lorem body 3");
        Comment comment4 = new Comment(1, 4, "name 4", "nobody4@gmail.com", "lorem body 4");
        Comment comment5 = new Comment(1, 5, "name 5", "nobody5@gmail.com", "lorem body 5");

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);

        for (Comment comment : comments) {
            System.out.println("Post ID: " + comment.getPostId());
            System.out.println("ID: " + comment.getId());
            System.out.println("Name: " + comment.getName());
            System.out.println("Email: " + comment.getEmail());
            System.out.println("Body: " + comment.getBody());
            System.out.println();
        }
    }
}