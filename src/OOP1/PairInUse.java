package OOP1;

public class PairInUse {
    public static void main(String[] args) {
        GenericPair<String> pair = new GenericPair<String>("d", "4");
        Pair<GenericPair<String>, Integer>  p = new Pair<GenericPair<String>, Integer>(pair, 1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(p.getFirst().getFirst());
        System.out.println(p.getFirst().getSecond());
        System.out.println(p.getSecond());
    }
}
