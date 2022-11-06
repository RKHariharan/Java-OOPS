package example;
public class Front extends javax.swing.JFrame {
    public Front() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        label1.setText("ONLINE BOOK STORE");
        getContentPane().add(label1);
        label1.setBounds(150, 60, 420, 60);

        button1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        button1.setLabel("USER");
        button1.setPreferredSize(new java.awt.Dimension(24, 24));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(280, 180, 130, 50);

        button2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        button2.setLabel("ADMIN");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(280, 290, 130, 50);

        pack();
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
             
                setVisible(false);
                User obj=new User();
                obj.setVisible(true);
    }
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
                setVisible(false);
                Admin obj=new Admin();
                obj.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
}
