public class TreeClass {

        private TreeClass Lchild , Rchild,parent;
        private String value;

        public TreeClass(String value)
        {
            this.value = value;
        }
        public TreeClass leftC() {
            return this.Lchild;
        }
        public TreeClass rightC() {
            return this.Rchild;
        }
        public TreeClass parentTree() {
            return this.parent;
        }

        public void addChild(TreeClass Lchild,TreeClass Rchild)
        {
            this.Lchild = Lchild;
            this.Rchild = Rchild;
            Lchild.parent = this;
            Rchild.parent = this;
        }
        public void addRChild(TreeClass Rchild)
        {
            this.Lchild = null;
            this.Rchild = Rchild;
            Lchild.parent = this;
            Rchild.parent = this;
        }
        public void addLChild(TreeClass Lchild)
        {
            this.Rchild = null;
            this.Lchild = Lchild;
            Lchild.parent = this;
            Rchild.parent = this;
        }
        public void printf() {
            System.out.println(value);
        }
    }