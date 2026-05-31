package tp10;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class InscriptionFormulaire extends JFrame {


    private JPanel panelH = new JPanel();
    private JPanel panelC = new JPanel();
    private JPanel panelF = new JPanel();

    private JTextField idMembreFieldT = new JTextField(20);
    private JTextField prenomFieldT = new JTextField(20);
    private JTextField nomFieldT = new JTextField(20);
    private JTextField adresseFieldT = new JTextField(20);
    private JTextField dateNaissanceFieldT = new JTextField(20);
    private JTextField lieuDeNaissanceFieldT = new JTextField(20);
    private JComboBox<String> SexeFieldT = new JComboBox<>(new String[] {"M", "F"});
    private JTextField professionFieldT = new JTextField(20);

    private JLabel idMembre = new JLabel("IdMembre:");
    private JLabel prenom = new JLabel("Prenom:");
    private JLabel nom = new JLabel("Nom:");
    private JLabel adresse = new JLabel("Adresse:");
    private JLabel dateNaissance = new JLabel("Date de Naissance:");
    private JLabel lieuDeNaissance = new JLabel("Lieu de Naissance:");
    private JLabel sexe = new JLabel("Sexe:");  
    private JLabel profession = new JLabel("Profession:");
    private JLabel title = new JLabel("Formulaire d'inscription");
    
    private JButton ajouter = new JButton("Ajouter");
    private JButton modifier = new JButton("Modifier");
    private JButton quitter = new JButton("Quitter");
    
    public InscriptionFormulaire() {
        setTitle("Formulaire d'inscription");
        setSize(700, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.setLayout(new BorderLayout(10, 10));
        this.add(panelH, BorderLayout.NORTH);
        this.add(panelC, BorderLayout.CENTER);
        this.add(panelF, BorderLayout.SOUTH);
        
        title.setFont(new Font("Arial", Font.BOLD, 28));
        panelH.add(title);
        panelH.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        panelC.setLayout(new GridLayout(8, 2, 15, 15));
        panelC.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        idMembre.setFont(labelFont);
        panelC.add(idMembre);
        panelC.add(idMembreFieldT);

        prenom.setFont(labelFont);
        panelC.add(prenom);
        panelC.add(prenomFieldT);
        // Row 3
        panelC.add(nom);
        panelC.add(nomFieldT);
        // Row 4
        panelC.add(adresse);
        panelC.add(adresseFieldT);
        // Row 5
        panelC.add(dateNaissance);
        panelC.add(dateNaissanceFieldT);
        // Row 6
        panelC.add(lieuDeNaissance);
        panelC.add(lieuDeNaissanceFieldT);
        // Row 7
        panelC.add(sexe);
        panelC.add(SexeFieldT);
        // Row 8
        panelC.add(profession);
        panelC.add(professionFieldT);


        Dimension buttonSize = new Dimension(150, 45);
        ajouter.setPreferredSize(buttonSize);
        modifier.setPreferredSize(buttonSize);
        quitter.setPreferredSize(buttonSize);
        
        panelF.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        panelF.add(ajouter);
        panelF.add(modifier);
        panelF.add(quitter);

        ajouter.addActionListener(new ButtonListner());

    }

    public class ButtonListner implements ActionListener {
        String url = "jdbc:mysql://localhost:3306/tpdb";
        String user = "root";
        String pass = "root";


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == ajouter) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Driver loaded susccessfuly!");

                    try (Connection con = DriverManager.getConnection(url, user, pass)) {
                        int id = Integer.parseInt(idMembreFieldT.getText());

                        String query = "insert into T_Membre (id, prenom, nom) values (?, ?, ?)";
                        PreparedStatement pstatement = con.prepareStatement(query);

                        pstatement.setInt(1, id);
                        pstatement.setString(2, prenomFieldT.getText());
                        pstatement.setString(3, nomFieldT.getText());

                        pstatement.executeUpdate();
                    }

                    catch (SQLException ex ) {
                        System.out.print(ex);

                    }
                    catch (NumberFormatException ex) {
                        System.out.println(ex);

                    }
                }

                catch (ClassNotFoundException ex) {
                    System.out.println(ex);

                }

                }
        }
    }

}