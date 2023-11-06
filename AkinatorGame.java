import java.util.Map;
import java.util.Scanner;

public class AkinatorGame {
    static Map<String, Map<String, String>> possiveisRestaurantes;
    public static void main(String[] args) {
        Estabelecimento restaurant = new Estabelecimento();
        possiveisRestaurantes = restaurant.getPossiveisRestaurantes();

        Scanner scanner = new Scanner(System.in);
        System.out.println("---- RESPONDA APENAS SIM/NAO PARA AS PERGUNTAS ----");
        while (true) {
            System.out.print("Você está pensando em um restaurante? ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                System.out.print("O País de Origem é os Estados Unidos? ");
                resposta = scanner.nextLine().toLowerCase();
                if(resposta.equals("sim")) {
                    System.out.println("Você está pensando no OutBack!!");
                    break;
                } else if(resposta.equals("nao")) {
                    System.out.println("Você está pensando no Paris 6!!");
                    break;
                } else {
                    System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                }
            } else if (resposta.equals("nao")) {
                System.out.print("O País de Origem é os Estados Unidos? ");
                resposta = scanner.nextLine().toLowerCase();
                if(resposta.equals("sim")) {
                    System.out.print("A influência culinária é Americana? ");
                    resposta = scanner.nextLine().toLowerCase();
                    if(resposta.equals("sim")) {
                        System.out.print("O Prato Principal é o Hamburguer? ");
                        resposta = scanner.nextLine().toLowerCase();
                        if(resposta.equals("sim")) {
                            System.out.print("O Big Mac faz parte do cardápio? ");
                            String resposta6 = scanner.nextLine().toLowerCase();
                            if(resposta6.equals("sim")) {
                                System.out.println("Você está pensando no Mc'Donalds!!");
                                break;
                            } else if(resposta6.equals("nao")) {
                                System.out.println("Você está pensando no Burguer King!!");
                                break;
                            } else {
                                System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                            }
                        } else if(resposta.equals("nao")) {
                            System.out.print("O Prato Principal é o Frango Frito? ");
                            resposta = scanner.nextLine().toLowerCase();
                            if(resposta.equals("sim")) {
                                System.out.println("Você está pensando no KFC!!");
                                break;
                            } else if(resposta.equals("nao")) {
                                System.out.println("Você está pensando no Subway!!");
                                break;
                            } else {
                                System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                            }
                        } else {
                            System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                        }
                    } else if(resposta.equals("nao")) {
                        System.out.print("A Influência Culinária é Mexicana? ");
                        resposta = scanner.nextLine().toLowerCase();
                        if(resposta.equals("sim")) {
                            System.out.println("Você está pensando no Taco Bell!!");
                            break;
                        } else if(resposta.equals("nao")) {
                            System.out.print("A Influência é Italiana? ");
                            resposta = scanner.nextLine().toLowerCase();
                            if(resposta.equals("sim")) {
                                System.out.println("Você está pensando na Domino's!!");
                                break;
                            } else if(resposta.equals("nao")) {
                                System.out.println("Você está pensando no Starbucks!!");
                                break;
                            } else {
                                System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                            }
                        } else {
                            System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                        }
                    }
                } else if(resposta.equals("nao")) {
                    System.out.print("O País de Origem é o Brasil? ");
                    resposta = scanner.nextLine().toLowerCase();
                    if(resposta.equals("sim")) {
                        System.out.print("O Prato Principal é Esfiha? ");
                        resposta = scanner.nextLine().toLowerCase();
                        if(resposta.equals("sim")) {
                            System.out.print("O Logo é um gênio? ");
                            resposta = scanner.nextLine().toLowerCase();
                            if(resposta.equals("sim")) {
                                System.out.println("Você está pensando no Habib's!!");
                                break;
                            } else if(resposta.equals("nao")) {
                                System.out.println("Você está pensando no Ponto da Esfiha!!");
                                break;
                            } else {
                                System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                            }
                        } else if(resposta.equals("nao")) {
                            System.out.print("O Prato Principal é Massa");
                            resposta = scanner.nextLine().toLowerCase();
                            if(resposta.equals("sim")) {
                                System.out.println("Você está pensando no Spoletto!!");
                                break;
                            } else if(resposta.equals("nao")) {
                                System.out.println("Você está pensando no Bob's!!");
                                break;
                            } else {
                                System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                            }
                        } else {
                            System.out.println("Resposta Inválida. Por favor, responda com 'Sim' ou 'Não'");
                        }
                    } else if(resposta.equals("nao")) {
                        System.out.println("Você está pensando no Pizza Hut!!");
                        break;
                    }
                }
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            }
        }
    }
}