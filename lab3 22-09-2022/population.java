/*
The population of a town increased from 175000 to 262500 in a decade. 
Calculate the average percent increase of population per year
*/

public class population {
    public static void main(String args[]) {
        double increased_total_population = 262500;
        double previous_total_population = 175000;
        double remaining = (increased_total_population - previous_total_population);
        double time_in_year = 10;
        double percentage = remaining / previous_total_population * 100;
        double population_per_year = percentage / time_in_year;
        System.out.print("population_per_year : ");
        System.out.println(population_per_year);
    }
}