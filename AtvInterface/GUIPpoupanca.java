import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIPpoupanca {

  private JButton butOK;
  private JTextField cjuros, canos, cdepMensal;
  private JLabel tjuros, tanos, tdepMensal, ctot_poupado, ttot_poupado;

  public GUIPpoupanca() {
    JFrame frame = new JFrame("Teste de Banco");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel painel = new JPanel();
    GridLayout flow = new GridLayout(5, 2);
    painel.setLayout(flow);
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);
    tjuros = new JLabel("Juros ao mês %: ");

    cjuros = new JTextField(15);
    tanos = new JLabel("Num de anos:  ");
    canos = new JTextField(15);
    tdepMensal = new JLabel("Depósito Mensal R$: ");
    cdepMensal = new JTextField(15);
    ttot_poupado = new JLabel("Total poupado R$: ");
    ctot_poupado = new JLabel("0");
    butOK = new JButton("OK");

    painel.add(tjuros);
    painel.add(cjuros);
    painel.add(tanos);
    painel.add(canos);
    painel.add(tdepMensal);
    painel.add(cdepMensal);
    painel.add(ttot_poupado);
    painel.add(ctot_poupado);
    painel.add(butOK);
    frame.getContentPane().add(painel);

    butOK.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Poupanca poup = new Poupanca(
            Integer.parseInt(cjuros.getText()),
            Double.parseDouble(canos.getText()),
            Double.parseDouble(cdepMensal.getText())
          );
          ctot_poupado.setText(poup.toString());
          ctot_poupado.setText(Double.toString(poup.calculaTotal()));
        }
      }
    );
    frame.pack();
    frame.setVisible(true);
  }
}
