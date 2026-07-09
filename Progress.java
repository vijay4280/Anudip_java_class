public class Progress {
  public static void showProgress() {

    System.out.println("complete");

  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
      showProgress();
    }

  }

}
