package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] mrs = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "This is a review";
        mrs[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "This is a review";
        mrs[1] = aboutTime;

        for (MovieReview mr : mrs) {
            System.out.println(mr.title + "\n" + mr.review);
        }
    }

}
