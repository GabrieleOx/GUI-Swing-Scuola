import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{
    static int what = 0;
    static boolean informa = false, testimonia = false, prova = false;

    public static void changeRet(int val){
        what = val;
    }

    public static void changeIn(){
        informa = true;
    }

    public static void changeTe(){
        testimonia = true;
    }

    public static void changePr(){
        prova = true;
    }

    public static boolean bunny(){
        return prova && informa && testimonia;
    }
    public static void main(String [] args){
        while(Home());
        Grazie();
        }

    public static void Grazie(){
        JFrame thanks = new JFrame("Grazie");
        JLabel ringr = new JLabel(), cuore = new JLabel(new ImageIcon("cuore.png"));
        ringr.setText("<html>Grazie per aver sostenuto tutto il lavoro svolto dai volontari<br>" + //
                        "per la comunita', speriamo di averti accanto a noi al piu' presto</html>");
        thanks.setSize(400, 300);
        thanks.getContentPane().setBackground(new Color(133, 189, 117));
        thanks.setResizable(false);
        thanks.add(ringr); thanks.add(cuore);
        ringr.setBounds(75, 25, 280, 180);
        ringr.setFont(new Font("Verdana", Font.BOLD, 18));
        cuore.setBounds(270, 80, 130, 130);
        thanks.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thanks.setVisible(true);
    }

    public static boolean Home(){ // qui mettiamo la schermata home, ritornerà false solo qundo si vuole uscire...
        JDialog home= new JDialog((Frame) null, "home", true);//crea la finestra
        JLabel titolo=new JLabel("IL VOLONTARIATO PER TUTTI");
        JButton info= new JButton("<html>INFORMAZIONI SUL<br>&nbsp;&nbsp;&nbsp;VOLONTARIATO</html>");
        JButton testi=new JButton("ALCUNE TESTIMONIANZE");  //&nbsp; => spazio che in html viene mostrato per forza diciamo
        JButton quiz=new JButton("<html>&nbsp;&nbsp;&nbsp;SCOPRI QUANTO NE<br>SAI DI VOLONTARIATO</html>");
        JButton exit=new JButton("EXIT");
        JButton egg=new JButton("EASTEREGG"); 
        home.setLayout(null);
        home.setSize(600, 600);
        home.getContentPane().setBackground(new Color(133, 189, 117));
        home.add(titolo); home.add(info); home.add(testi); home.add(quiz); home.add(exit); home.add(egg);
        if(bunny())
            egg.setVisible(true);
        else
            egg.setVisible(false);
        titolo.setBounds(95, 50, 400, 40);
        titolo.setFont(new Font("Verdana", Font.BOLD, 24));
        info.setBounds(150, 170, 300, 60);
         info.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeRet(1);
                changeIn();
                home.dispose();
            }
        });
        info.setFont(new Font("Verdana", Font.BOLD, 18));
        testi.setBounds(150, 240, 300, 40);
        testi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeRet(2);
                changeTe();
                home.dispose();
            }
        });
        testi.setFont(new Font("Verdana", Font.BOLD, 18));
        quiz.setBounds(150, 290, 300, 60);
        quiz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeRet(3);
                changePr();
                home.dispose();
            }
        });
        quiz.setFont(new Font("Verdana", Font.BOLD, 18));
        exit.setBounds(150, 360, 300, 40);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeRet(0);
                home.dispose();
            }
        });
        exit.setFont(new Font("Verdana", Font.BOLD, 18));
        egg.setBounds(150, 410, 300, 40);
        egg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeRet(4);
                home.dispose();
            }
        });
        egg.setFont(new Font("Verdana", Font.BOLD, 18));
        home.setSize(600, 600);
        home.addWindowListener(new WindowAdapter() { //Aggiunge o modifica l'azione effettuata alla chiusura della finestra (X rossa in alto a destra)
            public void windowClosing(WindowEvent e){
                changeRet(0);
            }
        });
        home.setVisible(true);
        switch(what){ // 0: Esci, 1: Info, 2: Testimonianze, 3: Quiz, 4: Easter egg
            case 0: return false;
            case 1: Informazioni.showInfo();return true;
            case 2: Testimonianze.showInfo();return true;
            case 3: Quiz();return true;
            case 4: EasterEgg.showInfo();return true;
            default: return true;
        }
    }

    public static void Quiz(){
        Question [] q = new Question[20]; //Le venti domande del quiz da settare:
        q[0] = new Question("Quale diritto ha un volontario?", "Diritto di ricevere formazione", "Dovere di impegnarsi", "Dovere di rispettare le regole", "Dovere di mantenere la riservatezza", 1);
        q[1] = new Question("Qual è un dovere di un volontario?", "Diritto di essere riconosciuti", "Dovere di impegnarsi", "Diritto alla sicurezza", "Diritto di essere trattati con rispetto", 2);
        q[2] = new Question("<html>Cosa significa il diritto alla <br>sicurezza per un volontario?</html>", "Essere trattati con rispetto", "Operare in un ambiente sicuro", "Rispettare le regole dell'organizzazione", "Partecipare a sessioni di formazione", 2);
        q[3] = new Question("<html>Quale comportamento è corretto per un volontario riguardo alla<br> riservatezza?</html>", "Condividere tutte le informazioni", "<html>Rispettare la riservatezza delle  <br>informazioni sensibili</html>", "Ignorare le politiche dell'organizzazione", "Condividere informazioni senza autorizzazione", 2);
        q[4] = new Question("<html>Cosa dovrebbe fare un volontario se non può più rispettare<br> un impegno preso?</html>", "Ignorare l'impegno", "<html>Informare l'organizzazione e cercare di trovare <br>una soluzione</html>", "Continuare senza informare nessuno", "Lasciare l'attività senza preavviso", 2);
        q[5] = new Question("<html>Quale diritto assicura che il volontario sia informato sugli obiettivi<br> dell'organizzazione?</html>", "Diritto alla sicurezza", "Diritto di essere riconosciuti", "Diritto di essere informati", "Diritto di ricevere formazione", 3);
        q[6] = new Question("<html>Qual è un dovere importante per mantenere un ambiente di lavoro<br> sicuro?</html>", "Ignorare le norme di sicurezza", "Rispettare le regole di sicurezza", "Lamentarsi delle condizioni di lavoro", "Evitare di seguire le indicazioni", 2);
        q[7] = new Question("<html>Quale diritto implica che i volontari debbano avere <br>accesso alle risorse necessarie?</html>", "Diritto di essere riconosciuti", "Diritto alla sicurezza", "Diritto di essere trattati con rispetto", "Diritto di formarsi", 4);
        q[8] = new Question("<html>Qual è uno dei benefici del riconoscimento dei volontari<br> da parte dell'organizzazione?</html>", "<html>Incrementa la motivazione <br>e l'impegno dei volontari</html>", "Riduce la produttività dei volontari", "Rende obbligatorio il volontariato", "Evita la formazione dei volontari", 1);
        q[9] = new Question("<html>Qual è un esempio di rispetto delle<br> regole dell'organizzazione?</html>", "Lavorare autonomamente senza guida", "Seguire le politiche e le procedure stabilite", "Evitare di comunicare con i superiori", "Ignorare le linee guida dell'organizzazione", 2);
        q[10] = new Question("<html>Perché è importante il dovere di impegnarsi<br> per un volontario?</html>", "<html>Per garantire che il lavoro sia completato <br> in modo affidabile</html>", "Per evitare responsabilità", "Per ridurre le interazioni con gli altri", "Per aumentare il tempo libero", 1);
        q[11] = new Question("<html>Quale diritto protegge i volontari dall'essere<br> maltrattati o discriminati?</html>", "Diritto alla sicurezza", "Diritto di essere trattati con rispetto", "Diritto di ricevere formazione", "Diritto di essere informati", 2);
        q[12] = new Question("<html>Qual è una pratica corretta per<br> mantenere la riservatezza delle informazioni?</html>", "Condividere i dati personali dei beneficiari", "Proteggere le informazioni sensibili", "Pubblicare le informazioni riservate online", "Ignorare le norme sulla riservatezza", 2);
        q[13] = new Question("<html>Quale dovere riguarda la partecipazione a sessioni<br> di formazione e aggiornamento?</html>", "Dovere di formarsi", "Dovere di impegnarsi", "Dovere di collaborare", "Dovere di mantenere la riservatezza", 1);
        q[14] = new Question("<html>Perché è importante che i volontari <br>collaborino con altri?</html>", "Per lavorare in isolamento", "Per creare un ambiente di lavoro armonioso", "Per evitare comunicazioni", "Per ignorare i suggerimenti degli altri", 2);
        q[15] = new Question("<html>Cosa significa il diritto di ricevere formazione<br> per un volontario?</html>", "Ottenere una retribuzione elevata", "<html>Ricevere una formazione adeguata per <br>svolgere il loro lavoro</html>", "Evitare qualsiasi tipo di istruzione", "Ignorare le opportunità di apprendimento", 2);
        q[16] = new Question("<html>Qual è un esempio di comportamento rispettoso per <br>un volontario?</html>", "Essere puntuali e affidabili", "Arrivare in ritardo senza avviso", "Ignorare le richieste dei superiori", "Lasciare i compiti incompleti", 1);
        q[17] = new Question("<html>Quale diritto garantisce che i volontari siano<br> riconosciuti per il loro contributo?</html>", "Diritto di essere riconosciuti", "Diritto alla sicurezza", "Diritto di formarsi", "Diritto di collaborare", 1);
        q[18] = new Question("<html>Quale dovere comporta il rispetto delle norme e<br> delle politiche dell'organizzazione?</html>", "Dovere di mantenere la riservatezza", "Dovere di rispettare le regole", "Dovere di formarsi", "Dovere di impegnarsi", 2);
        q[19] = new Question("<html>Perché è importante per i volontari mantenere <br>la riservatezza?</html>", "Per proteggere la privacy dei beneficiari", "Per condividere liberamente tutte le informazioni", "Per evitare di rispettare le norme", "Per pubblicare informazioni riservate", 1);

        for(int j = 0; j < 20; j++) 
            q[j].quiz();
        JDialog response = new JDialog((Frame) null, "Esito:", true);
        JLabel esito = new JLabel(Question.result()), titolo = new JLabel("Esito del quiz:");
        JButton back = new JButton("Back->Home");
        response.setResizable(false);
        esito.setFont(new Font("Verdana", Font.PLAIN, 17));
        titolo.setFont(new Font("Verdana", Font.BOLD, 30));
        back.setFont(new Font("Verdana", Font.BOLD, 12));
        response.setLayout(null);
        response.setSize(400, 350);
        response.getContentPane().setBackground(new Color(133, 189, 117));
        response.add(titolo); response.add(esito); response.add(back);
        titolo.setBounds(70, 40, 300, 40);
        esito.setBounds(70, 110, 300, 130);
        back.setBounds(250, 240, 120, 40);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                response.dispose();
            }
        });
        response.setVisible(true);
    }
}