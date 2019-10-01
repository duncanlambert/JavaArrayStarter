public class ArrayRunner
{
    public static void main(String[] args)
    {
//        Student me = new Student("Mr. Howe","December","blue");
//        System.out.println(me);

        Student[] myClass = new Student[12];
        Student studentA = new Student("Isabelle", "April", "Pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia", "October", "Purple");
        myClass[0] = studentB;

//        for (int i = 0; i<12; i++)
//        {
//            System.out.println(myClass[i]);
//        }

        String[] names = {"Campy","Brian","Duncan","Bennett","Martín","Jessica","Lexy","Zoe","Jimmy","Sanjit","Andrew","Will"};

        String[] months = {"February","October","March","September","July","February","November","December","August","May","September","December"};

        String[] colors = {"Green","Fuchsia","Purple","Turquoise","Cyan","Purple","Pink","Indigo","Green","Blue","Green","Space Black"};

        System.out.println("There are "+names.length+" names on the list.");

        for (int i=0;i<12;i++)
        {
            myClass[i] = new Student(names[i],months[i],colors[i]);
            //System.out.println(myClass[i]);
        }

        for (Student s: myClass)
        {
            if (s.getName().equals("Martín"))
            {
                System.out.print("* * * * * ");
            }
            System.out.println(s);
        }
    }
}
