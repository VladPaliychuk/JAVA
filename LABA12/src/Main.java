import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class TestProgram extends JFrame {

    private ArrayList<Integer> scores;
    private int currentQuestionIndex;
    private JLabel questionLabel;
    private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;
    private JButton nextButton;
    private ButtonGroup buttonGroup;

    private String[] questions = {
            "Питання 1",
            "Питання 2",
            "Питання 3"
    };

    private String[][] options = {
            {"Варіант 1", "Варіант 1", "Варіант 1"},
            {"Варіант 2", "Варіант 2", "Варіант 2"},
            {"Варіант 3", "Варіант 3", "Варіант 3"}
    };

    public TestProgram() {
        super("Тести");
        scores = new ArrayList<>();
        currentQuestionIndex = 0;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(5, 1));

        questionLabel = new JLabel(questions[currentQuestionIndex]);
        add(questionLabel);

        option1 = new JRadioButton(options[currentQuestionIndex][0]);
        option2 = new JRadioButton(options[currentQuestionIndex][1]);
        option3 = new JRadioButton(options[currentQuestionIndex][2]);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);

        add(option1);
        add(option2);
        add(option3);

        nextButton = new JButton("Далі");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAnswer();
                showNextQuestion();
            }
        });

        add(nextButton);

        setVisible(true);
    }

    private void processAnswer() {
        if (option1.isSelected()) {
            scores.add(5);
        } else {
            scores.add(2);
        }
    }

    private void showNextQuestion() {
        currentQuestionIndex++;

        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex]);
            option1.setText(options[currentQuestionIndex][0]);
            option2.setText(options[currentQuestionIndex][1]);
            option3.setText(options[currentQuestionIndex][2]);
        } else {
            showTestResult();
        }

        buttonGroup.clearSelection();
    }

    private void showTestResult() {
        int totalScore = 0;

        for (int score : scores) {
            totalScore += score;
        }

        double averageScore = (double) totalScore / scores.size();

        JOptionPane.showMessageDialog(this, "Ваш результат - " + averageScore);

        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestProgram();
            }
        });
    }
}
