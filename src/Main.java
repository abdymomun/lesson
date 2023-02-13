public class Main {
    public static void main(String[] args){
            Developer[] programmers = new Developer[3];
            programmers[0] = new Backend();
            programmers[1] = new Frontend();
            programmers[2] = new Developer();

            for (Developer p : programmers) {
                p.coding();
            }
        }
    }