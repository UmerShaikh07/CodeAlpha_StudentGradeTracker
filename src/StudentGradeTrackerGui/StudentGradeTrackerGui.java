package StudentGradeTrackerGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class StudentGradeTrackerGui extends JFrame {

    private final Color DARK_BLUE = new Color(30, 58, 95);
    private final Color BLUE = new Color(52, 120, 246);
    private final Color GREEN = new Color(34, 160, 107);
    private final Color ORANGE = new Color(245, 158, 11);
    private final Color WHITE = Color.WHITE;
    private final Color BACKGROUND = new Color(245, 247, 250);
    private final Color TEXT = new Color(45, 55, 72);

    private ArrayList<Student> students = new ArrayList<>();

    private JTextField txtName;
    private JTextField txtSubject1;
    private JTextField txtSubject2;
    private JTextField txtSubject3;

    private JButton btnAdd;
    private JButton btnClear;
    private JButton btnSummary;

    private JTable table;
    private DefaultTableModel tableModel;

    public StudentGradeTrackerGui() {

        setTitle("Student Grade Tracker");
        setSize(1000, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(
                new BorderLayout(15, 15)
        );

        mainPanel.setBackground(BACKGROUND);

        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        15, 15, 15, 15
                )
        );

        JPanel headerPanel = new JPanel(
                new BorderLayout()
        );

        headerPanel.setBackground(DARK_BLUE);

        headerPanel.setPreferredSize(
                new Dimension(0, 70)
        );

        JLabel title = new JLabel(
                "STUDENT GRADE TRACKER",
                SwingConstants.CENTER
        );

        title.setForeground(WHITE);

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26
                )
        );

        headerPanel.add(
                title,
                BorderLayout.CENTER
        );

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        JPanel inputCard = new JPanel(
                new BorderLayout(10, 10)
        );

        inputCard.setBackground(WHITE);

        inputCard.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                BLUE,
                                2
                        ),
                        BorderFactory.createEmptyBorder(
                                15, 20, 15, 20
                        )
                )
        );

        JLabel inputTitle = new JLabel(
                "ADD NEW STUDENT"
        );

        inputTitle.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        inputTitle.setForeground(DARK_BLUE);

        inputCard.add(
                inputTitle,
                BorderLayout.NORTH
        );

        JPanel fieldsPanel = new JPanel(
                new GridLayout(
                        4,
                        2,
                        15,
                        12
                )
        );

        fieldsPanel.setBackground(WHITE);

        JLabel lblName = new JLabel(
                "Student Name:"
        );

        styleLabel(lblName);

        fieldsPanel.add(lblName);

        txtName = new JTextField();

        styleTextField(txtName);

        fieldsPanel.add(txtName);

        JLabel lblSubject1 = new JLabel(
                "Subject 1 Marks:"
        );

        styleLabel(lblSubject1);

        fieldsPanel.add(lblSubject1);

        txtSubject1 = new JTextField();

        styleTextField(txtSubject1);

        fieldsPanel.add(txtSubject1);

        JLabel lblSubject2 = new JLabel(
                "Subject 2 Marks:"
        );

        styleLabel(lblSubject2);

        fieldsPanel.add(lblSubject2);

        txtSubject2 = new JTextField();

        styleTextField(txtSubject2);

        fieldsPanel.add(txtSubject2);

        JLabel lblSubject3 = new JLabel(
                "Subject 3 Marks:"
        );

        styleLabel(lblSubject3);

        fieldsPanel.add(lblSubject3);

        txtSubject3 = new JTextField();

        styleTextField(txtSubject3);

        fieldsPanel.add(txtSubject3);

        inputCard.add(
                fieldsPanel,
                BorderLayout.CENTER
        );

        JPanel buttonPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER,
                        15,
                        10
                )
        );

        buttonPanel.setBackground(WHITE);

        btnAdd = new JButton(
                "ADD STUDENT"
        );

        styleButton(
                btnAdd,
                GREEN
        );

        btnClear = new JButton(
                "CLEAR"
        );

        styleButton(
                btnClear,
                ORANGE
        );

        btnSummary = new JButton(
                "SHOW SUMMARY"
        );

        styleButton(
                btnSummary,
                BLUE
        );

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnSummary);

        inputCard.add(
                buttonPanel,
                BorderLayout.SOUTH
        );

        String[] columns = {
            "Student Name",
            "Subject 1",
            "Subject 2",
            "Subject 3",
            "Average",
            "Grade",
            "Status"
        };

        tableModel = new DefaultTableModel(
                columns,
                0
        ) {

            @Override
            public boolean isCellEditable(
                    int row,
                    int column
            ) {
                return false;
            }
        };

        table = new JTable(tableModel);

        table.setRowHeight(32);

        table.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        table.setForeground(TEXT);
        table.setBackground(WHITE);

        table.setGridColor(
                new Color(
                        220,
                        225,
                        232
                )
        );

        table.getTableHeader().setBackground(
                DARK_BLUE
        );

        table.getTableHeader().setForeground(
                WHITE
        );

        table.getTableHeader().setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        table.getTableHeader().setPreferredSize(
                new Dimension(
                        0,
                        38
                )
        );

        JScrollPane scrollPane =
                new JScrollPane(table);

        scrollPane.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(
                                BLUE,
                                2
                        ),
                        "STUDENT RECORDS"
                )
        );

        JPanel centerPanel = new JPanel(
                new BorderLayout(15, 15)
        );

        centerPanel.setBackground(BACKGROUND);

        centerPanel.add(
                inputCard,
                BorderLayout.NORTH
        );

        centerPanel.add(
                scrollPane,
                BorderLayout.CENTER
        );

        mainPanel.add(
                centerPanel,
                BorderLayout.CENTER
        );

        btnAdd.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e
                    ) {

                        addStudent();
                    }
                }
        );

        btnClear.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e
                    ) {

                        clearFields();
                    }
                }
        );

        btnSummary.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e
                    ) {

                        showSummary();
                    }
                }
        );

        txtSubject3.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e
                    ) {

                        addStudent();
                    }
                }
        );

        add(mainPanel);
    }

    private void styleLabel(
            JLabel label
    ) {

        label.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        label.setForeground(DARK_BLUE);
    }

    private void styleTextField(
            JTextField field
    ) {

        field.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        field.setForeground(TEXT);

        field.setBackground(
                new Color(
                        250,
                        252,
                        255
                )
        );

        field.setCaretColor(BLUE);

        field.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                new Color(
                                        170,
                                        185,
                                        210
                                ),
                                1
                        ),
                        BorderFactory.createEmptyBorder(
                                7,
                                10,
                                7,
                                10
                        )
                )
        );
    }

    private void styleButton(
            JButton button,
            Color color
    ) {

        button.setPreferredSize(
                new Dimension(
                        160,
                        42
                )
        );

        button.setBackground(color);
        button.setForeground(WHITE);

        button.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        button.setFocusPainted(false);

        button.setBorder(
                BorderFactory.createEmptyBorder(
                        8,
                        15,
                        8,
                        15
                )
        );

        button.setOpaque(true);
        button.setContentAreaFilled(true);
    }

    private void addStudent() {

        String name =
                txtName.getText().trim();

        if (name.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter student name.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

            txtName.requestFocus();

            return;
        }

        if (txtSubject1.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter Subject 1 marks.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject1.requestFocus();

            return;
        }

        if (txtSubject2.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter Subject 2 marks.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject2.requestFocus();

            return;
        }

        if (txtSubject3.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter Subject 3 marks.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject3.requestFocus();

            return;
        }

        double subject1;
        double subject2;
        double subject3;

        try {

            subject1 = Double.parseDouble(
                    txtSubject1.getText().trim()
            );

            subject2 = Double.parseDouble(
                    txtSubject2.getText().trim()
            );

            subject3 = Double.parseDouble(
                    txtSubject3.getText().trim()
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Marks must be numbers only.\n\n"
                    + "Example: 85",
                    "Invalid Marks",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        if (subject1 < 0 || subject1 > 100) {

            JOptionPane.showMessageDialog(
                    this,
                    "Subject 1 marks must be between 0 and 100.",
                    "Invalid Marks",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject1.requestFocus();

            return;
        }

        if (subject2 < 0 || subject2 > 100) {

            JOptionPane.showMessageDialog(
                    this,
                    "Subject 2 marks must be between 0 and 100.",
                    "Invalid Marks",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject2.requestFocus();

            return;
        }

        if (subject3 < 0 || subject3 > 100) {

            JOptionPane.showMessageDialog(
                    this,
                    "Subject 3 marks must be between 0 and 100.",
                    "Invalid Marks",
                    JOptionPane.ERROR_MESSAGE
            );

            txtSubject3.requestFocus();

            return;
        }

        Student student =
                new Student(
                        name,
                        subject1,
                        subject2,
                        subject3
                );

        students.add(student);

        tableModel.addRow(
                new Object[]{

                    student.getName(),

                    String.format(
                            "%.2f",
                            student.getSubject1()
                    ),

                    String.format(
                            "%.2f",
                            student.getSubject2()
                    ),

                    String.format(
                            "%.2f",
                            student.getSubject3()
                    ),

                    String.format(
                            "%.2f",
                            student.getAverage()
                    ),

                    student.getGrade(),

                    student.getStatus()
                }
        );

        JOptionPane.showMessageDialog(
                this,
                "Student added successfully!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE
        );

        clearFields();
    }

    private void clearFields() {

        txtName.setText("");
        txtSubject1.setText("");
        txtSubject2.setText("");
        txtSubject3.setText("");

        txtName.requestFocus();
    }

    private void showSummary() {

        if (students.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "No students have been added yet.",
                    "Summary",
                    JOptionPane.INFORMATION_MESSAGE
            );

            return;
        }

        double total = 0;

        double highest =
                students.get(0).getAverage();

        double lowest =
                students.get(0).getAverage();

        String highestStudent =
                students.get(0).getName();

        String lowestStudent =
                students.get(0).getName();

        int pass = 0;
        int fail = 0;

        for (Student student : students) {

            double average =
                    student.getAverage();

            total += average;

            if (average > highest) {

                highest = average;

                highestStudent =
                        student.getName();
            }

            if (average < lowest) {

                lowest = average;

                lowestStudent =
                        student.getName();
            }

            if (student.getStatus().equals("PASS")) {

                pass++;

            } else {

                fail++;
            }
        }

        double classAverage =
                total / students.size();

        String summary =
                "STUDENT GRADE SUMMARY\n\n"
                + "Total Students: "
                + students.size()
                + "\n\n"
                + "Class Average: "
                + String.format(
                        "%.2f",
                        classAverage
                )
                + "\n\n"
                + "Highest Average: "
                + String.format(
                        "%.2f",
                        highest
                )
                + "\nTop Student: "
                + highestStudent
                + "\n\n"
                + "Lowest Average: "
                + String.format(
                        "%.2f",
                        lowest
                )
                + "\nLowest Student: "
                + lowestStudent
                + "\n\n"
                + "Passed Students: "
                + pass
                + "\n"
                + "Failed Students: "
                + fail;

        JOptionPane.showMessageDialog(
                this,
                summary,
                "Student Grade Summary",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(
                new Runnable() {

                    @Override
                    public void run() {

                        StudentGradeTrackerGui app =
                                new StudentGradeTrackerGui();

                        app.setVisible(true);
                    }
                }
        );
    }
}