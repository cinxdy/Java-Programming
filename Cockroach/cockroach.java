public class cockroach{
  public static void main(String[] args){
    double volume_r = 0.002,rate = 0.95,volume_h = 20000;
    int count_r = 100,number_week=0;
    double volume_rs = volume_r * count_r;
    Scanner input = new Scanner(System.in);

    while(volume_rs <= volume_h){
      count_r=(int)(count_r * (rate+1));
      number_week++;
      volume_rs = volume_r * count_r;
    }

    System.out.println("Number of weeks : "+number_week);
    System.out.println("Number and volume of roaches : "+count_r+", "+volume_rs);

  }
}
