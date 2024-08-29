package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class Project extends JFrame implements ActionListener {

    Project() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1980, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // menu bar new infromation ============================================
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        mb.add(newInformation);
        mb.setBackground(Color.WHITE);
        newInformation.setForeground(Color.BLUE);
        setJMenuBar(mb);

        //menu item new faculty Information-------------------------------------
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        newInformation.add(facultyInfo);
        facultyInfo.setBackground(Color.WHITE);

        //menu item new student Information-------------------------------------
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        newInformation.add(studentInfo);
        studentInfo.setBackground(Color.WHITE);

        // menu bar details ====================================================
        JMenu details = new JMenu("Details");
        mb.add(details);
        details.setForeground(Color.RED);
        setJMenuBar(mb);

        //menu item new faculty Information-------------------------------------
        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        details.add(facultyDetails);
        facultyDetails.setBackground(Color.WHITE);

        //menu item new student Information-------------------------------------
        JMenuItem studentDetails = new JMenuItem("View Student Details ");
        details.add(studentDetails);
        studentInfo.setBackground(Color.WHITE);

        // Apply leave ========================================================
        JMenu leave = new JMenu("Apply Leave");
        mb.add(leave);
        leave.setForeground(Color.BLUE);
        setJMenuBar(mb);

        //Faculty leave---------------------------------------------------------
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        leave.add(facultyLeave);
        facultyLeave.setBackground(Color.WHITE);

        //menu item new student Information-------------------------------------
        JMenuItem studentLeave = new JMenuItem("Student Leave ");
        leave.add(studentLeave);
        studentLeave.setBackground(Color.WHITE);

        // Leave details =======================================================
        JMenu leaveDetails = new JMenu("Leave Details");
        mb.add(leaveDetails);
        mb.setBackground(Color.WHITE);
        leaveDetails.setForeground(Color.RED);
        setJMenuBar(mb);

        //Faculty leave---------------------------------------------------------
        JMenuItem facultyLeaveDetail = new JMenuItem("Faculty Leave Details");
        leaveDetails.add(facultyLeaveDetail);
        facultyLeaveDetail.setBackground(Color.WHITE);

        //menu item new student Information-------------------------------------
        JMenuItem studentLeaveDetail = new JMenuItem("Student Leave Details");
        leaveDetails.add(studentLeaveDetail);
        studentLeaveDetail.setBackground(Color.WHITE);

        // Exams ===============================================================
        JMenu exam = new JMenu("Examination");
        mb.add(exam);
        mb.setBackground(Color.WHITE);
        exam.setForeground(Color.BLUE);
        setJMenuBar(mb);

        //Examination Details---------------------------------------------------
        JMenuItem examinationDetails = new JMenuItem("Examination Details");
        exam.add(examinationDetails);
        examinationDetails.setBackground(Color.WHITE);

        //menu item  student marks----------------------------------------------
        JMenuItem studentMarks = new JMenuItem(" Student Marks ");
        exam.add(studentMarks);
        studentMarks.setBackground(Color.WHITE);

        // update information ===========-------================================
        JMenu updateInfo = new JMenu("Upate Details");
        mb.add(updateInfo);
        updateInfo.setForeground(Color.RED);
        setJMenuBar(mb);

        //Examination Details---------------------------------------------------
        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateInfo.add(updateFacultyInfo);
        updateFacultyInfo.setBackground(Color.WHITE);

        //menu item  student marks----------------------------------------------
        JMenuItem updateStudentInfo = new JMenuItem(" Update Faculty Details");
        updateInfo.add(updateStudentInfo);
        updateStudentInfo.setBackground(Color.WHITE);

        // Fee information =====================================================
        JMenu fee = new JMenu("Fee Details");
        mb.add(fee);
        mb.setBackground(Color.WHITE);
        fee.setForeground(Color.BLUE);
        setJMenuBar(mb);

        //fee structure---------------------------------------------------------
        JMenuItem feeStructure = new JMenuItem(" Fee Structure");
        fee.add(feeStructure);
        feeStructure.setBackground(Color.WHITE);

        //menu item  student marks----------------------------------------------
        JMenuItem feeForm = new JMenuItem(" Student Fee Form");
        fee.add(feeForm);
        updateStudentInfo.setBackground(Color.WHITE);

        // Utility =============================================================
        JMenu utilty = new JMenu("Utilty");
        mb.add(utilty);
        utilty.setForeground(Color.RED);
        setJMenuBar(mb);

        // Notepad -------------------------------------------------------------
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        utilty.add(notepad);
        notepad.addActionListener(this);
// -----------------------------
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        utilty.add(calculator);
        calculator.addActionListener(this);

        // exit ================================================================
        JMenu exit = new JMenu("Exit");
        mb.add(exit);
        exit.setForeground(Color.BLUE);
        setJMenuBar(mb);

        // Exit ----------------------------------------------------------------
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        exit.add(ex);
        ex.addActionListener(this);

        //----------------------------------------------------------------------
        setSize(1980, 1080);
        setVisible(true);
    }

    //--------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        new Project();
    }

}
