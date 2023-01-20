class Theatre
{
static String theatre_name = "Jazz Cinemas";//class specific info
 String movie_name;//object specific info.
 int  movie_time;
public static void main(String[] args)
{
Theatre screen1 = new Theatre();
Theatre screen2 = new Theatre();
Theatre screen3 = new Theatre();
screen1.movie_name = "varisu";//initializaion or assign
screen2.movie_name = "Thunivu";
screen1.movie_time = 1030;
screen2.movie_time = 1045;
System.out.println(theatre_name );
System.out.println(Theatre.theatre_name );
System.out.println(screen1.theatre_name );
System.out.println(screen1.movie_name );
System.out.println(screen2.movie_name );
System.out.println(screen1.movie_time );
System.out.println(screen2.movie_time );
screen1.movie_release();
screen2.movie_release();
//Theatre.clean_theatre();
//screen1.clean_theatre();
clean_theatre();
}
void movie_release()
{
System.out.println("New Movies" + movie_name);
System.out.println("New Movies" + movie_name);
System.out.println("New Movies" + theatre_name);
}
static void clean_theatre()
{
System.out.println("Cleaning process" );
}









}
