package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notas {
    public JPanel pnlMain;
    private JTextField txtapellido;
    private JTextField txtdocumentoidentidad;
    private JTextField txtcorreoelectronico;
    private JTextField txtnombre;
    private JLabel lblnombre;
    private JLabel lblapellidos;
    private JLabel lbldocid;
    private JLabel lblcorreoelectronico;
    private JButton btnNuevoEstudiante;
    private JTextField txtnombremateria;
    private JTextField txtnota;
    private JButton btnrevisarnota;
    private JButton btnnuevaMateria;
    private JButton btnfinalizar;
    private JTextField txtcodigo;
    private JTextField txtnumerocreditos;
    private JTextField txtmostrarestudiante;
    private JTextField txtmostrarMateria;
    private JLabel lblnombremateria;
    private JLabel lblcodigomateria;
    private JLabel lblcreditos;
    private JLabel lblnota;
    private JTextField txtpromedio;
    private JDialog dlgShowInfo;

    private Estudiante estudiante;
    private Materia materia;

    public Notas() {

        btnNuevoEstudiante.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)  {

                    estudiante = new Estudiante(txtnombre.getText(), txtapellido.getText(),
                            txtdocumentoidentidad.getText(), txtcorreoelectronico.getText());
                    btnnuevaMateria.setVisible(true);
                    btnNuevoEstudiante.setVisible(false);
                    txtnombre.setVisible(false);
                    txtapellido.setVisible(false);
                    txtdocumentoidentidad.setVisible(false);
                    txtcorreoelectronico.setVisible(false);
                    txtnombremateria.setVisible(true);
                    txtcodigo.setVisible(true);
                    txtnumerocreditos.setVisible(true);
                    txtnota.setVisible(true);
                    lblnombre.setText("Código Materia");
                    lblapellidos.setText("Nombre Materia");
                    lbldocid.setText("Número Creditos");
                    lblcorreoelectronico.setText("Nota");


            }
        });
        btnnuevaMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                materia = new Materia(Integer.parseInt(txtcodigo.getText()), txtnombremateria.getText(),
                        Integer.parseInt(txtnumerocreditos.getText()), Double.parseDouble(txtnota.getText()));
                estudiante.getMaterias().add(materia);
                btnfinalizar.setVisible(true);
                btnNuevoEstudiante.setVisible(false);
                txtnombremateria.setText("");
                txtcodigo.setText("");
                txtnumerocreditos.setText("");
                txtnota.setText("");
                txtmostrarestudiante.setVisible(true);
                txtmostrarMateria.setVisible(true);
                txtpromedio.setVisible(true);

            }
        });
        btnfinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmostrarestudiante.setText("Nombre: " + estudiante.getNombre() + ", apellido: " + estudiante.getApellido() +
                        ", identificación: " + estudiante.getId() + ", correo electrónico: " + estudiante.getCorreoElectronico());

                String materias = "";
                for (int i = 0; i < estudiante.getMaterias().size(); i++) {
                    materias += "Código: " + estudiante.getMaterias().get(i).getCodigo() + ", nombre materia: " + estudiante.getMaterias().get(i).getNombreM() +
                            ", numero de créditos: " + estudiante.getMaterias().get(i).getNumeroCreditos() + ", nota: " + estudiante.getMaterias().get(i).getNota() + "-------";
                }
                txtmostrarMateria.setText(materias);
                txtpromedio.setText("El promedio es: "+estudiante.calcularPromedio());


            }
        });
    }
}

