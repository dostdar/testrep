public class Main {

    public static void main(String[] args) {


        TreeClass aClass = new TreeClass("god");
        TreeClass  r  = new TreeClass("RIGHT child");
        TreeClass  l  = new TreeClass("LEFT child");
        TreeClass  rr  = new TreeClass("RIGHT RIGHT child");
        TreeClass  rl  = new TreeClass("RIGHT LEFT child");
        TreeClass  lr  = new TreeClass("LEFT RIGHT child");
        TreeClass  ll  = new TreeClass("LEFT LEFT child");

        aClass.addChild(l,r);
        r.addChild(rl,rr);
        l.addChild(ll,lr);

        aClass.leftC().rightC().parentTree().printf();







    }
}
