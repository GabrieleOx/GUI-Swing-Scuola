 class Main{
    public static void main(String [] args){
        //Informazioni.showInfo();
        //Testimonianze.showInfo();
        Question x = new Question("Domanda 1:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 0);
        x.quiz();
        Question y = new Question("Domanda 2:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 0);
        y.quiz();
        //System.out.println("Le risposte date sono: " + Question.getRDate()); Era solo di test
    }
}