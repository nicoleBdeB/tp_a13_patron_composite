package patroncomposite;

public class TstComposite {
    public static void main(String[] args) {
        //création de produits à mettre dans les boites
        Pencil p1=new Pencil(2,3,"crayon","bleu");
        Pencil p2=new Pencil(2,3,"crayon","rouge");
        Pencil p3=new Pencil(2,3,"crayon","jaune");
        Pencil p4=new Pencil(2,3,"crayon","vert");

        Scissor s1=new Scissor(10,3,"ciseaux","couture");
        Scissor s2=new Scissor(10,3,"ciseaux","cuisine");
        Scissor s3=new Scissor(10,3,"ciseaux","coiffure");
        Scissor s4=new Scissor(10,3,"ciseaux","enfant");

        // création et remplissage de boites
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();

        b1.addProduct(p1);
        b1.addProduct(p2);
        b1.addProduct(p3);
        b1.addProduct(p4);

        b2.addProduct(s4);
        b3.addProduct(b2);
        b3.addProduct(b1);
        b3.addProduct(s2);

        //vérification que getWeight retourne bien le poids total de tous les produits dans la boite
        System.out.println("La boite 3 qui contient 4 pencil et deux ciseaux devrait peser 28 : Résultat= "+b3.getWeight());
        //montrer le contenu de la boite
        System.out.println(b3);

    }
}
