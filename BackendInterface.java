// --== CS400 File Header Information ==--
// Name: HUI GENG
// Email: hgeng7@wisc.edu
// Team: GE red
// Role: Backend developer
// TA: Surabhi
// Lecturer: Florian
// Notes to Grader: <optional extra notes>

import java.util.List;
public interface BackendInterface {
    public int getSize();  // return the nodes number
    public boolean isDorm(String a);  //checks whether a dorm "a" is in the database
    public Edge addDorm(String a, List<String> neighbors, List<Integer> weights); // if dorm "a" is not in the database, adds the dorm to it, along with its location
    public Edge removeDorm(String a); // remove the dorm "a" in the database
    public List<Edge> findCheapestDelivery(String a, String b); //  calculate the most inexpensive delivery from a to b;
    public List<Edge> findFastestDelivery(String a, String b); //  calculate the  shortest path  delivery from a to b;
}