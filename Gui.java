import java.awt.Container;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
   
    JButton button_novo,button_trancar,button_cancelar,button_reabrir, button_fechar;
    JLabel label_nome,label_matricula,label_situacao;
    JTextField text_field_nome,text_field_matricula,text_field_situacao;
    
    Aluno aluno;
   
    public Gui() {
        setTitle("Inserir Aluno");
        setSize(600,300);                 
        setLocation(400,200);
       
        Container cont = getContentPane();
        cont.setLayout(null);
        cont.setBackground(new Color( 255,255,255));
       
        cont.add(label_nome = new JLabel("Nome :"));
        label_nome.setLocation(10, 20);
        label_nome.setSize(100,50);
        label_nome.setForeground(new Color(0,0,0));
        cont.add(text_field_nome = new JTextField());
        text_field_nome.setLocation(85,30);
        text_field_nome.setSize(240,25);
        text_field_nome.setForeground(new Color( 0,0,139));
       
        cont.add(label_matricula = new JLabel("Matricula :"));
        label_matricula.setLocation(10,50);
        label_matricula.setSize(100,50);
        label_matricula.setForeground(new Color( 0,0,0));
        cont.add(text_field_matricula = new JTextField());
        text_field_matricula.setLocation(85,60);
        text_field_matricula.setSize(240,25);
        text_field_matricula.setForeground(new Color( 0,0,139));
       
        cont.add(label_situacao = new JLabel("Situação :"));
        label_situacao.setLocation(10,80);
        label_situacao.setSize(100,50);
        label_situacao.setForeground(new Color( 0,0,0));
        cont.add(text_field_situacao = new JTextField());
        text_field_situacao.setLocation(85,90);
        text_field_situacao.setSize(240,25);
        text_field_situacao.setForeground(new Color( 0,0,139));
       
        cont.add(button_novo = new JButton("Novo"));
        button_novo.setLocation(0,200);
        button_novo.setSize(100,40);
        button_novo.setForeground(new Color(255,255,255));
        button_novo.setBackground(new Color (0,0,0));
        button_novo.addActionListener(
        		new ActionListener()
        		{
					@Override
					public void actionPerformed(ActionEvent e) {
						aluno = new Aluno(text_field_nome.getText(),  Integer.parseInt(text_field_matricula.getText()));
						text_field_situacao.setText(aluno.getNomeEstado());
					}
				}
			);
       
        cont.add(button_trancar = new JButton("Trancar"));
        button_trancar.setLocation(100,200);
        button_trancar.setSize(100,40);
        button_trancar.setForeground(new Color(255,255,255));
        button_trancar.setBackground(new Color (0,0,0));
        button_trancar.addActionListener(
        		new ActionListener()
        		{
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				try
        				{
        					aluno.trancar();
        					text_field_situacao.setText(aluno.getNomeEstado());
        			     }catch (Exception e1) {
        					JOptionPane.showMessageDialog(null, "Operação não suportada!", "Aviso!!!", JOptionPane.INFORMATION_MESSAGE);
        				}
        			}   				
        		}
        	);
       
        cont.add(button_cancelar = new JButton("Cancelar"));
        button_cancelar.setLocation(200,200);
        button_cancelar.setSize(100,40);
        button_cancelar.setForeground(new Color(255,255,255));
        button_cancelar.setBackground(new Color (0,0,0));
        button_cancelar.addActionListener(
        		new ActionListener()
        		{
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				try
        				{
        					aluno.cancelar();
        					text_field_situacao.setText(aluno.getNomeEstado());
        			     }catch (Exception e1) {
        					JOptionPane.showMessageDialog(null, "Operação não suportada!", "Aviso!!!", JOptionPane.INFORMATION_MESSAGE);
        				}
        			}
        		}
        	);
       
        cont.add(button_reabrir = new JButton("Reabrir"));
        button_reabrir.setLocation(300,200);
        button_reabrir.setSize(100,40);
        button_reabrir.setForeground(new Color(255,255,255));
        button_reabrir.setBackground(new Color (0,0,0));
        button_reabrir.addActionListener(
        		new ActionListener()
        		{
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				try
        				{
        					aluno.reabrir();
        					text_field_situacao.setText(aluno.getNomeEstado());
        			     }catch (Exception e1) {
        					JOptionPane.showMessageDialog(null, "Operação não suportada!", "Aviso!!!", JOptionPane.INFORMATION_MESSAGE);
        				}
        			}
        		}
        	);
        cont.add(button_fechar = new JButton("Fechar"));
        button_fechar.setLocation(400,200);
        button_fechar.setSize(100,40);
        button_fechar.setForeground(new Color(255,255,255));
        button_fechar.setBackground(new Color (0,0,0));
        button_fechar.addActionListener(
        		new ActionListener()
        		{
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				System.exit(0);
        			}
        		}
        	);
        
        button_novo.addActionListener(this);
        button_trancar.addActionListener(this);
           
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	}
		
	public static void main(String args[]){
		Gui gui = new Gui();
		gui.setVisible(true);
	}
}