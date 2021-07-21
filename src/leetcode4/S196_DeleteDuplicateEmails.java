package leetcode4;

public class S196_DeleteDuplicateEmails {
    public static void main(String[] args) {
        String query = "DELETE p1 FROM Person p1,\n" +
                "    Person p2\n" +
                "WHERE\n" +
                "    p1.Email = p2.Email AND p1.Id > p2.Id";
    }
}
