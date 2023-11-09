import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AkinatorInterface {
    private JFrame frame;
    private JLabel questionLabel;
    private JButton yesButton;
    private JButton noButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AkinatorInterface game = new AkinatorInterface();
            game.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        SwingUtilities.invokeLater(() -> {
            frame.setVisible(true);
        });
    }

    private JButton[] showQuestion(String questionText) {
        frame.getContentPane().removeAll();

        questionLabel.setText(questionText);
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        yesButton = new JButton("Sim");
        yesButton.setBounds(150, 140, 120, 40);
        noButton = new JButton("Nao");
        noButton.setBounds(330, 140, 120, 40);

        frame.add(questionLabel);
        frame.add(yesButton);
        frame.add(noButton);

        frame.revalidate();
        frame.repaint();

        return new JButton[] { yesButton, noButton };
    }

    public AkinatorInterface() {
        frame = new JFrame("Akinator Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        questionLabel = new JLabel("Você esta pensando em um restaurante?");
        questionLabel.setBounds(10, 60, 580, 30);
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        yesButton = new JButton("Sim");
        yesButton.setBounds(150, 140, 120, 40);
        noButton = new JButton("Nao");
        noButton.setBounds(330, 140, 120, 40);
        yesButton.setFocusPainted(false);
        frame.add(questionLabel);
        frame.add(yesButton);
        frame.add(noButton);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton[] buttons = showQuestion("O País de Origem é os Estados Unidos?");
                buttons[0].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Você pensou no OutBack");
                        System.exit(0);
                    }
                });
                buttons[1].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Você pensou no Paris 6");
                        System.exit(0);
                    }
                });
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton[] buttons = showQuestion("O País de Origem é os Estados Unidos?");
                buttons[0].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton[] buttons = showQuestion("A influência Culinária é Americana?");
                        buttons[0].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JButton[] buttons = showQuestion("O Prato Principal é o Hamburguer?");
                                buttons[0].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JButton[] buttons = showQuestion("O Big Mac faz parte do cardápio?");
                                        buttons[0].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Mc'Donalds");
                                                System.exit(0);
                                            }
                                        });
                                        buttons[1].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Burguer King");
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                                buttons[1].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JButton[] buttons = showQuestion("O Prato Principal é o Frango Frito?");
                                        buttons[0].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no KFC");
                                                System.exit(0);
                                            }
                                        });
                                        buttons[1].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Subway");
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        buttons[1].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JButton[] buttons = showQuestion("A Influência Culinária e Mexicana?");
                                buttons[0].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JOptionPane.showMessageDialog(null, "Você pensou no Taco Bell");
                                        System.exit(0);
                                    }
                                });
                                buttons[1].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JButton[] buttons = showQuestion("A Influência Culinária e Italiana?");
                                        buttons[0].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JButton[] buttons = showQuestion("O Logo tem um dominó?");
                                                buttons[0].addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Você pensou no Domino's");
                                                        System.exit(0);
                                                    }
                                                });
                                                buttons[1].addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Você pensou no Pizza Hut");
                                                        System.exit(0);
                                                    }
                                                });
                                            }
                                        });
                                        buttons[1].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no StarBucks");
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                buttons[1].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton[] buttons = showQuestion("O País de Origem é o Brasil?");
                        buttons[0].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JButton[] buttons = showQuestion("O Prato Principal é Esfiha?");
                                buttons[0].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JButton[] buttons = showQuestion("O logo tem um Gênio?");
                                        yesButton.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Habib's");
                                                System.exit(0);
                                            }
                                        });
                                        noButton.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Ponto da Esfiha");
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                                buttons[1].addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JButton[] buttons = showQuestion("O Prato Principal é Massa?");
                                        buttons[0].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Spoletto");
                                                System.exit(0);
                                            }
                                        });
                                        buttons[1].addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(null, "Você pensou no Bob's");
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        buttons[1].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Você pensou no AutoGrill");
                                System.exit(0);
                            }
                        });
                    }
                });
            }
        });
    }
}
