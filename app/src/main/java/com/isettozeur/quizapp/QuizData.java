package com.isettozeur.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuizData {
    public static final String[] THEMES = {"Histoire", "Géographie", "Sport", "Politique", "Technologie"};

    public static final List<Question> QUESTIONS_HISTOIRE = new ArrayList<>();
    static {
        QUESTIONS_HISTOIRE.add(new Question(
                "Quand a eu lieu la Guerre de Sécession aux États-Unis ?",
                new String[]{"1861-1865", "1776-1783", "1914-1918"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_HISTOIRE.add(new Question(
                "Quelle bataille a été décisive pendant les guerres napoléoniennes ?",
                new String[]{"Bataille de Waterloo", "Bataille d'Austerlitz", "Bataille de Leipzig"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_HISTOIRE.add(new Question(
                "Quel explorateur a navigué autour du Cap de Bonne-Espérance en 1488 ?",
                new String[]{"Vasco de Gama", "Christopher Colombus", "Bartolomeu Dias"},
                2 // Index de la réponse correcte
        ));


    }

    public static final List<Question> QUESTIONS_GEOGRAPHIE = new ArrayList<>();
    static {
        QUESTIONS_GEOGRAPHIE.add(new Question(
                "Quelle est la capitale du Japon ?",
                new String[]{"Shanghai", "Beijing", "Tokyo"},
                2 // Index de la réponse correcte
        ));

        QUESTIONS_GEOGRAPHIE.add(new Question(
                "Quel est le plus long fleuve du monde ?",
                new String[]{"Nil", "Amazone", "Yangtsé"},
                1 // Index de la réponse correcte
        ));

        QUESTIONS_GEOGRAPHIE.add(new Question(
                "Quel pays est le plus grand en termes de superficie ?",
                new String[]{"Canada", "Russie", "États-Unis"},
                1 // Index de la réponse correcte
        ));

    }

    public static final List<Question> QUESTIONS_SPORT = new ArrayList<>();
    static {
        QUESTIONS_SPORT.add(new Question(
                "Quel pays a remporté la Coupe du Monde de football 2018 ?",
                new String[]{"France", "Brésil", "Allemagne"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_SPORT.add(new Question(
                "Quel est le plus grand événement de tennis au monde ?",
                new String[]{"Wimbledon", "Roland Garros", "US Open"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_SPORT.add(new Question(
                "Combien de joueurs composent une équipe de basketball sur le terrain ?",
                new String[]{"5", "6", "7"},
                0 // Index de la réponse correcte
        ));

    }


    public static final List<Question> QUESTIONS_POLITIQUE = new ArrayList<>();
    static {
        QUESTIONS_POLITIQUE.add(new Question(
                "Quel est le système politique en Chine ?",
                new String[]{"Démocratie", "République", "Parti unique - Communisme"},
                2 // Index de la réponse correcte
        ));

        QUESTIONS_POLITIQUE.add(new Question(
                "Quelle est la plus haute instance judiciaire aux États-Unis ?",
                new String[]{"Cour suprême", "Cour d'appel", "Cour fédérale"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_POLITIQUE.add(new Question(
                "Quel pays a une monarchie constitutionnelle ?",
                new String[]{"Royaume-Uni", "France", "Allemagne"},
                0 // Index de la réponse correcte
        ));

    }

    public static final List<Question> QUESTIONS_TECHNOLOGIE = new ArrayList<>();
    static {
        QUESTIONS_TECHNOLOGIE.add(new Question(
                "Quel est le fondateur de Microsoft ?",
                new String[]{"Steve Jobs", "Bill Gates", "Mark Zuckerberg"},
                1 // Index de la réponse correcte
        ));

        QUESTIONS_TECHNOLOGIE.add(new Question(
                "Qu'est-ce que le langage de programmation Java ?",
                new String[]{"Un langage de programmation orienté objet", "Un langage de script", "Un langage de bas niveau"},
                0 // Index de la réponse correcte
        ));

        QUESTIONS_TECHNOLOGIE.add(new Question(
                "Quelle entreprise a développé le système d'exploitation Android ?",
                new String[]{"Google", "Microsoft", "Apple"},
                0 // Index de la réponse correcte
        ));

    }
}
