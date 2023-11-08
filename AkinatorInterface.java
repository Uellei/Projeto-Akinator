import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AkinatorInterface {
  private JFrame frame;
  private JLabel questionLabel;
  private JButton yesButton;
  private JButton noButton;
  private JFrame currentQuestionFrame;

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

  public AkinatorInterface() {
    frame = new JFrame("Akinator Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 150);
    frame.setLayout(null);

    questionLabel = new JLabel("Voce esta pensando em um restaurante?");
    questionLabel.setBounds(10, 10, 380, 20);

    yesButton = new JButton("Sim");
    yesButton.setBounds(10, 40, 80, 30);

    noButton = new JButton("Nao");
    noButton.setBounds(100, 40, 80, 30);

    frame.add(questionLabel);
    frame.add(yesButton);
    frame.add(noButton);

    yesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Segunda Pergunta");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(null);
        JLabel questionLabel = new JLabel("O Pais de Origem e os Estados Unidos?");
        questionLabel.setBounds(10, 10, 380, 20);
        JButton yesButton = new JButton("Sim");
        yesButton.setBounds(10, 40, 80, 30);
        JButton noButton = new JButton("Não");
        noButton.setBounds(100, 40, 80, 30);
        frame.add(questionLabel);
        frame.add(yesButton);
        frame.add(noButton);
        frame.setVisible(true);
        yesButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Akinator Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(null);

            JLabel label = new JLabel("Voce pensou no OutBack");
            label.setBounds(10, 10, 200, 20);

            frame.add(label);
            frame.setVisible(true);
          }
        });
        noButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Akinator Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(null);

            JLabel label = new JLabel("Voce pensou no Paris 6");
            label.setBounds(10, 10, 200, 20);

            frame.add(label);
            frame.setVisible(true);
          }
        });
      }
    });
    noButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Segunda Pergunta");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(null);
        JLabel questionLabel = new JLabel("O Pais de Origem e os Estados Unidos?");
        questionLabel.setBounds(10, 10, 380, 20);
        JButton yesButton = new JButton("Sim");
        yesButton.setBounds(10, 40, 80, 30);
        JButton noButton = new JButton("Não");
        noButton.setBounds(100, 40, 80, 30);
        frame.add(questionLabel);
        frame.add(yesButton);
        frame.add(noButton);
        frame.setVisible(true);
        yesButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Terceira Pergunta");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(null);
            JLabel questionLabel = new JLabel("A influencia Culinaria e Americana?");
            questionLabel.setBounds(10, 10, 380, 20);
            JButton yesButton = new JButton("Sim");
            yesButton.setBounds(10, 40, 80, 30);
            JButton noButton = new JButton("Não");
            noButton.setBounds(100, 40, 80, 30);
            frame.add(questionLabel);
            frame.add(yesButton);
            frame.add(noButton);
            frame.setVisible(true);
            yesButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Quarta Pergunta");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(400, 150);
                frame.setLayout(null);
                JLabel questionLabel = new JLabel("O Prato Principal e o Hamburguer?");
                questionLabel.setBounds(10, 10, 380, 20);
                JButton yesButton = new JButton("Sim");
                yesButton.setBounds(10, 40, 80, 30);
                JButton noButton = new JButton("Não");
                noButton.setBounds(100, 40, 80, 30);
                frame.add(questionLabel);
                frame.add(yesButton);
                frame.add(noButton);
                frame.setVisible(true);
                yesButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Quinta Pergunta");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);
                    JLabel questionLabel = new JLabel(
                        "O Big Mac faz parte do cardapio?");
                    questionLabel.setBounds(10, 10, 380, 20);
                    JButton yesButton = new JButton("Sim");
                    yesButton.setBounds(10, 40, 80, 30);
                    JButton noButton = new JButton("Não");
                    noButton.setBounds(100, 40, 80, 30);
                    frame.add(questionLabel);
                    frame.add(yesButton);
                    frame.add(noButton);
                    frame.setVisible(true);
                    yesButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Mc'Donalds");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                    noButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Burguer King");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                  }
                });
                noButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Quarta Pergunta");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);
                    JLabel questionLabel = new JLabel("O Prato Principal e o Frango Frito?");
                    questionLabel.setBounds(10, 10, 380, 20);
                    JButton yesButton = new JButton("Sim");
                    yesButton.setBounds(10, 40, 80, 30);
                    JButton noButton = new JButton("Não");
                    noButton.setBounds(100, 40, 80, 30);
                    frame.add(questionLabel);
                    frame.add(yesButton);
                    frame.add(noButton);
                    frame.setVisible(true);
                    yesButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no KFC");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                    noButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Subway");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });

                  }
                });
              }
            });
            noButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Quarta Pergunta");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(400, 150);
                frame.setLayout(null);
                JLabel questionLabel = new JLabel("A Influencia Culinaria e Mexicana?");
                questionLabel.setBounds(10, 10, 380, 20);
                JButton yesButton = new JButton("Sim");
                yesButton.setBounds(10, 40, 80, 30);
                JButton noButton = new JButton("Não");
                noButton.setBounds(100, 40, 80, 30);
                frame.add(questionLabel);
                frame.add(yesButton);
                frame.add(noButton);
                frame.setVisible(true);
                yesButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Akinator Game");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);

                    JLabel label = new JLabel("Voce pensou no Taco Bell");
                    label.setBounds(10, 10, 200, 20);

                    frame.add(label);
                    frame.setVisible(true);
                  }
                });
                noButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Quarta Pergunta");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);
                    JLabel questionLabel = new JLabel("A Influencia Culinaria e Italiana?");
                    questionLabel.setBounds(10, 10, 380, 20);
                    JButton yesButton = new JButton("Sim");
                    yesButton.setBounds(10, 40, 80, 30);
                    JButton noButton = new JButton("Não");
                    noButton.setBounds(100, 40, 80, 30);
                    frame.add(questionLabel);
                    frame.add(yesButton);
                    frame.add(noButton);
                    frame.setVisible(true);
                    yesButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Quarta Pergunta");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);
                        JLabel questionLabel = new JLabel("O Logo tem um domino?");
                        questionLabel.setBounds(10, 10, 380, 20);
                        JButton yesButton = new JButton("Sim");
                        yesButton.setBounds(10, 40, 80, 30);
                        JButton noButton = new JButton("Não");
                        noButton.setBounds(100, 40, 80, 30);
                        frame.add(questionLabel);
                        frame.add(yesButton);
                        frame.add(noButton);
                        frame.setVisible(true);
                        yesButton.addActionListener(new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                            JFrame frame = new JFrame("Akinator Game");
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setSize(400, 150);
                            frame.setLayout(null);

                            JLabel label = new JLabel("Voce pensou na Domino's");
                            label.setBounds(10, 10, 200, 20);

                            frame.add(label);
                            frame.setVisible(true);
                          }
                        });
                        noButton.addActionListener(new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                            JFrame frame = new JFrame("Akinator Game");
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setSize(400, 150);
                            frame.setLayout(null);

                            JLabel label = new JLabel("Voce pensou no Pizza Hut");
                            label.setBounds(10, 10, 200, 20);

                            frame.add(label);
                            frame.setVisible(true);
                          }
                        });
                      }
                    });
                    noButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no StarBucks");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                  }
                });
              }
            });
          }
        });
        noButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Terceira Pergunta");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(null);
            JLabel questionLabel = new JLabel("O Pais de Origem e o Brasil?");
            questionLabel.setBounds(10, 10, 380, 20);
            JButton yesButton = new JButton("Sim");
            yesButton.setBounds(10, 40, 80, 30);
            JButton noButton = new JButton("Não");
            noButton.setBounds(100, 40, 80, 30);
            frame.add(questionLabel);
            frame.add(yesButton);
            frame.add(noButton);
            frame.setVisible(true);
            yesButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Quarta Pergunta");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(400, 150);
                frame.setLayout(null);
                JLabel questionLabel = new JLabel("O Prato Principal e Esfiha?");
                questionLabel.setBounds(10, 10, 380, 20);
                JButton yesButton = new JButton("Sim");
                yesButton.setBounds(10, 40, 80, 30);
                JButton noButton = new JButton("Não");
                noButton.setBounds(100, 40, 80, 30);
                frame.add(questionLabel);
                frame.add(yesButton);
                frame.add(noButton);
                frame.setVisible(true);
                yesButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Quinta Pergunta");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);
                    JLabel questionLabel = new JLabel(
                        "O Logo e um Genio?");
                    questionLabel.setBounds(10, 10, 380, 20);
                    JButton yesButton = new JButton("Sim");
                    yesButton.setBounds(10, 40, 80, 30);
                    JButton noButton = new JButton("Não");
                    noButton.setBounds(100, 40, 80, 30);
                    frame.add(questionLabel);
                    frame.add(yesButton);
                    frame.add(noButton);
                    frame.setVisible(true);
                    yesButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Habib's");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                    noButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Ponto da Esfiha");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                  }
                });
                noButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Quinta Pergunta");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(400, 150);
                    frame.setLayout(null);
                    JLabel questionLabel = new JLabel(
                        "O Prato Principal e Massa?");
                    questionLabel.setBounds(10, 10, 380, 20);
                    JButton yesButton = new JButton("Sim");
                    yesButton.setBounds(10, 40, 80, 30);
                    JButton noButton = new JButton("Não");
                    noButton.setBounds(100, 40, 80, 30);
                    frame.add(questionLabel);
                    frame.add(yesButton);
                    frame.add(noButton);
                    frame.setVisible(true);
                    yesButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Spoletto");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                    noButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("Akinator Game");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 150);
                        frame.setLayout(null);

                        JLabel label = new JLabel("Voce pensou no Bob's");
                        label.setBounds(10, 10, 200, 20);

                        frame.add(label);
                        frame.setVisible(true);
                      }
                    });
                  }
                });

              }
            });
            noButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Akinator Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 150);
                frame.setLayout(null);

                JLabel label = new JLabel("Voce pensou no Autogrill");
                label.setBounds(10, 10, 200, 20);

                frame.add(label);
                frame.setVisible(true);
              }
            });
          }
        });
      }
    });
    noButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Akinator Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(null);

        JLabel label = new JLabel("Voce pensou no Paris 6");
        label.setBounds(10, 10, 200, 20);

        frame.add(label);
        frame.setVisible(true);
      }
    });
  }

  void makeQuestion(String tituloPergunta, String pergunta) {
    JFrame frame = new JFrame(tituloPergunta);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(400, 150);
    frame.setLayout(null);

    JLabel questionLabel = new JLabel(pergunta);
    questionLabel.setBounds(10, 10, 380, 20);

    JButton yesButton = new JButton("Sim");
    yesButton.setBounds(10, 40, 80, 30);

    JButton noButton = new JButton("Não");
    noButton.setBounds(100, 40, 80, 30);

    frame.add(questionLabel);
    frame.add(yesButton);
    frame.add(noButton);

    frame.setVisible(true);
  }
}