import java.util.*;

public class Assighment {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<String, Integer> dic =new HashMap<>();

        while (true) {
            System.out.println("add word 1");
            System.out.println("search word 2");
            System.out.println("suggest words 3");
            System.out.println("exit 4");
            System.out.print("choose option: ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch ==1) {
                System.out.print("enter word: ");
                String wo =sc.nextLine();

                if (dic.containsKey(wo)) {
                    System.out.println("already exists");
                } else {
                    dic.put(wo,1);
                    System.out.println("word added");
                }
            } else if (ch ==2) {




                System.out.print("enter word: ");
                String wo = sc.nextLine();

                if (dic.containsKey(wo)) {
                    dic.put(wo, dic.get(wo) + 1);
                    System.out.println("found");
                } else {
                    System.out.println("not found");
                }
            } else if (ch ==3) {
                System.out.print("enter prefix: ");
                String prf = sc.nextLine();

                System.out.print("enter k: ");
                int k = sc.nextInt();

                List<String> res =new ArrayList<>();

                for (String wo : dic.keySet()) {
                    if (wo.startsWith(prf)) {
                        res.add(wo);
                    }
                }




                Collections.sort(res, new Comparator<String>() {
                    public int compare(String w1, String w2) {
                        int fCom = dic.get(w2) - dic.get(w1);
                        if (fCom != 0) {
                            return fCom;
                        }
                        return w1.compareTo(w2);
                    }
                });
                if (res.size() > k) {
                    res =res.subList(0, k);
                }

                System.out.println("suggestions: " +res);



            } else if (ch==4) {
                System.out.println("exiting");
                break;
            } else {
                System.out.println("invalid choice");
            }
        }

        sc.close();
    }
}
