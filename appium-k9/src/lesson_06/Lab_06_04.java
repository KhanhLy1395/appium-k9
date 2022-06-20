package lesson_06;

public class Lab_06_04 {

    public static void main(String[] args) {

        String url = "http://google.com";
        String[] urlDomain = url.split(".");
        String[] urlProtocol = url.split(":");
        for (String domain : urlDomain) {
            if (domain.equals("com")) System.out.println("Domain .com");
            else if (domain.equals("net")) System.out.println(" domain .net");
        }

        for (String protocol : urlProtocol) {
            if (protocol.equals("https")) System.out.println("https");
            else if (protocol.equals("http")) System.out.println("http");
        }
    }
}
