import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exam {
        public static void main(String[] args) {

            JFrame frame = new JFrame();    //Pencere açmak için kullanılan sınıf
            frame.setTitle("Kim Milyoner Olmak İster?");    //Pencerenin başlığını ayarlar
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Program kapatıldığında çıkış yapar
            frame.setSize(500,400);     //Pencerenin boyutlarını belirler
            frame.setVisible(true);     //Pencereyi görünür yap
            frame.setResizable(false);      //Pencerenin boyutunu değiştirilmez yap
            frame.getContentPane().setBackground(Color.BLACK);      //Pencere arkaplan rengini ayarlama

            JLabel label = new JLabel();    //Pencerede yazı yazmamıza veya resim yüklememize olanak sağlayan sınıftır
            label.setText("En büyük rakam ile en küçük asal sayinin toplami kaçtir?");  //ekrana yazı yazar
            label.setVerticalAlignment(JLabel.TOP);     //yazının dikey konumunu belirtir
            label.setFont(new Font("Arial", Font.BOLD, 14));    //yazının tipini fontunu ve büyüklüğünü ayarlar
            label.setHorizontalAlignment(JLabel.CENTER);    //yazının yatay konumunu belirtir
            label.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));  //yazının kenarlarla arasında olan boşlukları ayarlar
            frame.add(label);   //etiketi ekrana ekler
            label.setForeground(Color.WHITE);   //metinin rengini ayarlar
            frame.revalidate(); // Bileşenlerin yerleşimini günceller
            frame.repaint(); // Yeniden boyama işlemi yapar


            JButton buttonA = new JButton("A) 9 ");     //buton oluşturma sınıfıdır içine yazı yazılabilir
            buttonA.setBounds(0,100,500,50);    //butonun yatay ve dikeydeki konumunu ve yükseklik ve genişliğini belirtir
            buttonA.addActionListener(new ActionListener() {    //butona tıkladıktan sonra ne yapılacağı belirtilir
                @Override
                public void actionPerformed(ActionEvent e) {    //tetiklenen olayları işler
                    buttonA.setBackground(Color.RED);   //butona tıkladıktan sonra buton kırmızı olur
                    JOptionPane.showMessageDialog(null, "Üzgünüm, yanlış cevap. Lütfen tekrar deneyin.");   //ekrana mesaj gönderir
                    System.exit(0);//sistemden çıkar

                }
            });
            frame.add(buttonA);     //ekrana buton ekler
            buttonA.setFocusable(false);    //butona odaklanmayı kapatır (yazıyı çevreleyen çizgileri kaldırır)


            JButton buttonB = new JButton("B) 0 ");
            buttonB.setBounds(0,160,500,50);
            buttonB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonB.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Üzgünüm, yanlış cevap. Lütfen tekrar deneyin.");
                    System.exit(0);

                }
            });
            frame.add(buttonB);
            buttonB.setFocusable(false);

            JButton buttonC = new JButton("C) 10 ");
            buttonC.setBounds(0,220,500,50);
            buttonC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonC.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Üzgünüm, yanlış cevap. Lütfen tekrar deneyin.");
                    System.exit(0);

                }
            });
            frame.add(buttonC);
            buttonC.setFocusable(false);

            JButton buttonD = new JButton("D) 11 ");
            buttonD.setBounds(0,280,500,50);

            buttonD.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonD.setBackground(Color.GREEN);
                    JOptionPane.showMessageDialog(null, "Doğru cevap! Tebrikler!");
                }
            });
            frame.add(buttonD);
            buttonD.setFocusable(false);

            JLabel timerLabel = new JLabel();
            timerLabel.setBounds(0, 320, 500, 50);
            timerLabel.setFont(new Font("Arial", Font.BOLD, 14));
            timerLabel.setForeground(Color.WHITE);
            timerLabel.setHorizontalAlignment(JLabel.CENTER);
            label.add(timerLabel, BorderLayout.PAGE_END); // timerLabel'ı panelin alt kısmına yerleştir


            frame.add(label);

            int sure = 20;  //sayacı başlatacağı süre

            Timer timer = new Timer(1000, new ActionListener() {    //zamanlayıcı oluşturur
                int remainingTime = sure;

                public void actionPerformed(ActionEvent e) {    //zamanlayıcı tarafından tetiklenen olayları yapmaya yarar
                    remainingTime--;
                    timerLabel.setText("Kalan Süre: " + remainingTime + " saniye");

                    if (remainingTime == 0) {
                        ((Timer) e.getSource()).stop();     //süre 0 olunca zamanlayıcıyı durdurur
                        JOptionPane.showMessageDialog(null, "Süreniz doldu!");
                        System.exit(0);
                    }
                }
            });

            timer.start();  //sayacı başlatır


        }

    }


