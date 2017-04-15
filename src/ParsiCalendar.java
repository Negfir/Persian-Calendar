
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 *
 * @author NeginFirouzian
 *
 *
 */

public class ParsiCalendar extends JFrame {

    private FileRead fileRead;
    private JLabel label;
    private final JLabel GeorgianDate;
    private final JLabel ArabDate;
    private final JButton buttons[];
    private final JPanel buttonJPanel1;
    private final JToolBar toolbar;
    private final JButton editNote;
    private final JButton editEvent;
    private final JButton addNote;
    private final JButton addEvent;
    private final JMenuBar menuBar;
    private final JMenu insert;
    private final JMenuItem addmenuEvent;
    private final JMenuItem addmenuNote;
    private final JMenu edit;
    private final JMenuItem editmenuEvent;
    private final JMenuItem editmenuNote;
    private final JMenuItem copyDate;
    private final JMenuItem copyEvent;
    private final JPopupMenu popup1;
    final PopupMenu popup = new PopupMenu();
    private final JLabel statusBar;
    MenuItem show;
    Menu edit1;
    Menu insert1;
    MenuItem editmenuEvent1;
    MenuItem editmenuNote1;
    MenuItem copyDate1;
    MenuItem copyEvent1;
    MenuItem addmenuEvent1;
    MenuItem addmenuNote1;
    MenuItem exit;

    private String[] event = new String[50];
    Calendar grgCal = Calendar.getInstance(new ULocale("en_US"));
    Calendar prsCal = Calendar.getInstance(new ULocale("fa_IR"));
    Calendar prsCal2 = Calendar.getInstance(new ULocale("fa_IR"));
    Calendar arbCal = Calendar.getInstance(new ULocale("ar_SA"));
    DateFormat prsDate = DateFormat.getDateInstance(DateFormat.FULL, new ULocale("fa_IR"));
    DateFormat arbDate = DateFormat.getDateInstance(DateFormat.FULL, new ULocale("ar_SA"));
    DateFormat grgDate = DateFormat.getDateInstance(DateFormat.FULL, new ULocale("en_US"));

    public ParsiCalendar() {

        super("گاهشمار پارسی");
        fileRead = new FileRead();
        menuBar = new JMenuBar();
        insert = new JMenu("درج");
//        insert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        addmenuEvent = new JMenuItem("اضافه کردن رویداد");
        menuBar.add(Box.createHorizontalGlue());
        insert.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addmenuNote = new JMenuItem("اضافه کردن یادداشت");
        addmenuNote.addActionListener(new AddNoteHandler());
        addmenuNote.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addmenuEvent.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addmenuNote.setDisplayedMnemonicIndex(0);
        addmenuEvent.setDisplayedMnemonicIndex(0);
        insert.add(addmenuNote);
        insert.add(addmenuEvent);
        insert.setDisplayedMnemonicIndex(0);

        edit = new JMenu("ویرایش");
        edit.setDisplayedMnemonicIndex(0);
        edit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        editmenuEvent = new JMenuItem("ویرایش رویدادهای روز مربوطه");
        editmenuNote = new JMenuItem("ویرایش یادداشت های روز مربوطه");
        copyDate = new JMenuItem("کپی کردن متن تاریخ روز انتخاب شده");
        copyEvent = new JMenuItem("کپی کردن متن مناسبت روز انتخاب شده");

        editmenuEvent.setDisplayedMnemonicIndex(0);
        editmenuNote.setDisplayedMnemonicIndex(0);
        copyDate.setDisplayedMnemonicIndex(0);
        copyEvent.setDisplayedMnemonicIndex(0);

        editmenuEvent.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        editmenuNote.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        copyDate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        copyEvent.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        copyDate.addActionListener(new CopyDateHandler());
        copyEvent.addActionListener(new CopyEventHandler());

        popup1 = new JPopupMenu();
        //popup.add(addmenuNote);
        // popup.add(addmenuEvent);

        popup1.add(editmenuNote);
        popup1.add(editmenuEvent);
        popup1.add(copyDate);
        popup1.add(copyEvent);
        popup1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        popup1.addMouseListener(new RightMouseHandler());
        //   add(popup1);

        edit.add(editmenuNote);
        edit.add(editmenuEvent);
        edit.add(copyDate);
        edit.add(copyEvent);

        addmenuNote.addActionListener(new AddNoteHandler());
        editmenuNote.addActionListener(new EditNoteHandler());
        editmenuEvent.addActionListener(new EditEventHandler());
        addmenuEvent.addActionListener(new AddEventHandler());

        menuBar.add(insert);
        menuBar.add(edit);

        this.setJMenuBar(menuBar);

        statusBar = new JLabel();
        add(statusBar, BorderLayout.SOUTH);
        statusBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        statusBar.setBackground(Color.red);
        toolbar = new JToolBar();
        label = new JLabel();
        ArabDate = new JLabel();
        GeorgianDate = new JLabel();
        javax.swing.border.Border border = BorderFactory.createLineBorder(new Color(70, 130, 180));

        JButton b1 = new JButton();
        editNote = new JButton();
        editEvent = new JButton();
        addNote = new JButton();
        addEvent = new JButton();

        addNote.addActionListener(new AddNoteHandler());
        editNote.addActionListener(new EditNoteHandler());
        editEvent.addActionListener(new EditEventHandler());
        addEvent.addActionListener(new AddEventHandler());

        editNote.setToolTipText("ویرایش یادداشت");
        editEvent.setToolTipText("ویرایش رویداد");
        addNote.setToolTipText("تعریف یادداشت");
        addEvent.setToolTipText("تعریف رویداد");

        b1.setToolTipText("ماه قبل");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                prsCal.add(Calendar.MONTH, -1);
                updateMonth();
            }
        });
        Icon ic2 = new ImageIcon("Button-Next-icon.png");
        Icon ic1 = new ImageIcon("Button-Previous-icon.png");
        Icon ic3 = new ImageIcon("date-add-icon.png");
        Icon ic4 = new ImageIcon("date-edit-icon.png");
        Icon ic5 = new ImageIcon("note-add-icon.png");
        Icon ic6 = new ImageIcon("note-edit-icon.png");
        editNote.setIcon(ic6);
        editEvent.setIcon(ic4);
        addNote.setIcon(ic5);
        addEvent.setIcon(ic3);
        //Icon ic7=new ImageIcon("");
        toolbar.addSeparator();
        toolbar.setRollover(true);
        toolbar.setAlignmentX(Component.RIGHT_ALIGNMENT);
        //toolbar.add(b1);
        JButton b2 = new JButton();
        b2.setToolTipText("ماه بعد");
        b2.setIcon(ic2);
        b1.setIcon(ic1);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                prsCal.add(Calendar.MONTH, +1);
                updateMonth();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label.setSize(100, 20);
        toolbar.add(ArabDate);
        toolbar.addSeparator();
        toolbar.add(GeorgianDate);
        toolbar.addSeparator();
        toolbar.add(label, BorderLayout.CENTER);
        toolbar.addSeparator();

        toolbar.add(editNote);

        toolbar.add(editEvent);
        toolbar.add(addNote);
        toolbar.add(addEvent);
        toolbar.addSeparator();
        toolbar.add(b1, BorderLayout.WEST);
        toolbar.add(b2, BorderLayout.EAST);
        //add(toolbar,BorderLayout.NORTH);
        panel.add(toolbar, BorderLayout.EAST);

        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");

        }

        String[] columns = {"شنبه", "یکشنبه", "دوشنبه", "سه شنبه", "چهارشنیه", "پنحشنبه", "جمعه"};

        buttons = new JButton[49];
        buttonJPanel1 = new JPanel();
        buttonJPanel1.setLayout(new GridLayout(7, 7));
        buttonJPanel1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttonJPanel1.setAlignmentX(Component.LEFT_ALIGNMENT);

        for (int count = 0; count < 7; count++) {

            buttons[count] = new JButton(columns[count]);
            buttons[count].setBackground(new Color(70, 130, 180));
            //buttons[count].setForeground(Color.white);
            buttonJPanel1.add(buttons[count]);
            buttons[count].setAlignmentX(Component.RIGHT_ALIGNMENT);
        }

        for (int count = 7; count < 49; count++) {

            buttons[count] = new JButton("");
            buttons[count].addMouseListener(new LeftMouseHandler());
            buttons[count].addMouseListener(new RightMouseHandler());
            buttons[count].add(popup1);
            buttonJPanel1‌‌.add(buttons[count]);
            buttons[count].setAlignmentX(Component.RIGHT_ALIGNMENT);
            buttons[count].setBackground(new Color(173, 216, 230));

        }
        //  buttonJPanel1.add(model);
        this.add(buttonJPanel1, BorderLayout.CENTER);
        this.add(panel, BorderLayout.NORTH);
        this.updateMonth();

        try {
            Image picture = ImageIO.read(new File((prsCal.get(Calendar.DAY_OF_MONTH)) + ".png"));
            final TrayIcon trayIcon
                    = new TrayIcon(picture, "jhj");
            final SystemTray tray = SystemTray.getSystemTray();

            // Create a pop-up menu components
            show = new MenuItem("نمایش پنجره اصلی");
            edit1 = new Menu("ویرایش");
            insert1 = new Menu("درج");
            editmenuEvent1 = new MenuItem("ویرایش رویدادهای روز مربوطه");
            editmenuNote1 = new MenuItem("ویرایش یادداشت های روز مربوطه");
            copyDate1 = new MenuItem("کپی کردن متن تاریخ روز انتخاب شده");
            copyEvent1 = new MenuItem("کپی کردن متن مناسبت روز انتخاب شده");
            addmenuEvent1 = new MenuItem("اضافه کردن رویداد");
            addmenuNote1 = new MenuItem("اضافه کردن یادداشت");
            exit = new MenuItem("خروج از برنامه");
            show.addActionListener(new ShowJFrame());
            exit.addActionListener(new Exit());

            popup.add(show);
            popup.addSeparator();

            popup.add(edit1);
            popup.add(insert1);
            insert1.add(addmenuNote1);
            insert1.add(addmenuEvent1);
            edit1.add(editmenuNote1);
            edit1.add(editmenuEvent1);
            edit1.add(copyDate1);
            edit1.add(copyEvent1);
            popup.addSeparator();
            popup.add(exit);

            copyDate1.addActionListener(new CopyDateHandler());
            copyEvent1.addActionListener(new CopyEventHandler());
            addmenuNote1.addActionListener(new AddNoteHandler());
            editmenuNote1.addActionListener(new EditNoteHandler());
            editmenuEvent1.addActionListener(new EditEventHandler());
            addmenuEvent1.addActionListener(new AddEventHandler());

            trayIcon.setPopupMenu(popup);
            trayIcon.addMouseListener(new DoubleClick());
            //updateMonth();
            trayIcon.setToolTip(fileRead.File(prsCal.get(Calendar.MONTH) + 1, prsCal.get(Calendar.DAY_OF_MONTH)) + "<br>" + fileRead.readNote(prsCal.get(Calendar.MONTH) + 1, prsCal.get(Calendar.DAY_OF_MONTH)) + "</p>");

            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.out.println("TrayIcon could not be added.");
            }
        } catch (IOException e) {

        }

    }

    /**
     * this method is for updating month
     *
     * @param void
     * @return void
     */
    void updateMonth() {

        //GeorgianDate.setText(grgCal.get(Calendar.DAY_OF_MONTH) + "/" + (grgCal.get(Calendar.MONTH) + 1) + "/" + grgCal.get(Calendar.YEAR));
        // prsCal.
        //prsCal2.set(1395, prsCal.get(Calendar.MONTH) , prsCal2.get(Calendar.DAY_OF_MONTH)+1);
        int startDay = prsCal.get(Calendar.DAY_OF_WEEK) + 4;
        int numberOfDays = prsCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //prsCal.set(prsCal.get(Calendar.YEAR), prsCal.get(Calendar.MONTH)+1,prsCal.get(Calendar.DAY_OF_MONTH ));

        GeorgianDate.setText(grgDate.format(grgCal));
        label.setText(prsDate.format(prsCal));
        ArabDate.setText(arbDate.format(arbCal));

        for (int count = 7; count < 49; count++) {

            buttons[count].setText("");

        }
        int i = startDay;
        for (int j = 1; j <= numberOfDays; j++) {
            int n = i + 7;

            buttons[n].setText(j + "");
            i = i + 1;
            buttons[n].setToolTipText(fileRead.File(prsCal.get(Calendar.MONTH) + 1, j) + "<br>" + fileRead.readNote(prsCal.get(Calendar.MONTH) + 1, j) + "</p>");
            //    buttons[n].setToolTipText(fileRead.Read(prsCal.get(Calendar.MONTH) + 1, j));

        }

    }

    private class LeftMouseHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isLeftMouseButton(e) || e.isControlDown()) {
                JButton b = new JButton();
                b = (JButton) e.getSource();
                //statusBar.setText(f.dayConvert(Integer.parseInt(b.getText())));
                statusBar.setText(fileRead.File(prsCal.get(Calendar.MONTH) + 1, Integer.parseInt(b.getText())));

                /*
            System.out.println(f.dayConvert(Integer.parseInt(b.getText())));
            event[Integer.parseInt(b.getText())] = f.dayConvert(Integer.parseInt(b.getText()));
                 */
                prsCal2.set(prsCal.get(Calendar.YEAR), prsCal.get(Calendar.MONTH), Integer.parseInt(b.getText()));
                arbCal.setTime(prsCal2.getTime());
                grgCal.setTime(prsCal2.getTime());
                GeorgianDate.setText(grgDate.format(grgCal));
                label.setText(prsDate.format(prsCal2));
                ArabDate.setText(arbDate.format(arbCal));

                //prsCal2.set(prsCal.get(Calendar.YEAR), prsCal.get(Calendar.MONTH)-1,prsCal.get(Calendar.DAY_OF_MONTH ));
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //Farvardin f1 = new Farvardin();

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //Farvardin f1 = new Farvardin();

        }

    }

    private class RightMouseHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isRightMouseButton(e) || e.isControlDown()) {
                JButton b = new JButton();
                b = (JButton) e.getSource();
                //System.out.println("llll");
                popup.show((JButton) e.getComponent(), e.getX(), e.getY());

                //statusBar.setText(f.dayConvert(Integer.parseInt(b.getText())));
                statusBar.setText(fileRead.File(prsCal.get(Calendar.MONTH) + 1, Integer.parseInt(b.getText())));
                //System.out.println("ccc");
                prsCal2.set(prsCal.get(Calendar.YEAR), prsCal.get(Calendar.MONTH), Integer.parseInt(b.getText()));
                arbCal.setTime(prsCal2.getTime());
                grgCal.setTime(prsCal2.getTime());
                GeorgianDate.setText(grgDate.format(grgCal));
                label.setText(prsDate.format(prsCal2));
                ArabDate.setText(arbDate.format(arbCal));

            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // Farvardin f1 = new Farvardin();

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //Farvardin f1 = new Farvardin();

        }

    }

    private class AddNoteHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = JOptionPane.showInputDialog(null,
                    "افزودن یادداشت", "");
            fileRead.noteCreateFile((prsCal.get(Calendar.MONTH) + 1), prsCal2.get(Calendar.DAY_OF_MONTH), n);
            updateMonth();

        }

    }

    private class EditNoteHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = JOptionPane.showInputDialog("ویرایش یادداشت");
            fileRead.EditNote((prsCal.get(Calendar.MONTH) + 1), prsCal2.get(Calendar.DAY_OF_MONTH), n);
            updateMonth();

        }

    }

    private class EditEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = JOptionPane.showInputDialog("ویرایش رویداد");
            updateMonth();
            fileRead.EditEvent((prsCal.get(Calendar.MONTH) + 1), prsCal2.get(Calendar.DAY_OF_MONTH), n);
            //fileRead.EditEvent(5, 1, n);

            updateMonth();

        }

    }

    private class AddEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = JOptionPane.showInputDialog("افزودن رویداد");
            updateMonth();
            fileRead.AddEvent(n, (prsCal.get(Calendar.MONTH) + 1), prsCal2.get(Calendar.DAY_OF_MONTH));
            //fileRead.EditEvent(5, 1, n);

            updateMonth();

        }

    }

    private class CopyDateHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String myString = prsDate.format(prsCal);
            StringSelection stringSelection = new StringSelection(myString);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);

        }

    }

    private class CopyEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String myString = fileRead.File(prsCal.get(Calendar.MONTH) + 1, prsCal.get(Calendar.DAY_OF_MONTH));
            StringSelection stringSelection = new StringSelection(myString);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);

        }

    }

    private class ShowJFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            setVisible(true);

        }

    }

    private class Exit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);

        }

    }

    private class DoubleClick implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getClickCount() == 2 && !e.isConsumed()) {
                setVisible(true);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //  Farvardin f1 = new Farvardin();

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Farvardin f1 = new Farvardin();

        }

    }

}
