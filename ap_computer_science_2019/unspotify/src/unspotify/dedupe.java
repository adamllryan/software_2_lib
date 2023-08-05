package unspotify;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class dedupe
{
    public static void main(final String[] args) {
        final JFrame frame = new JFrame("Spotify De-Duplicator");
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 400);
        final JPanel panel = new JPanel();
        final JLabel label = new JLabel("Paste the Playlist and then hit De-Dupe");
        final JButton send = new JButton("De-Dupe");
        final JTextArea ta = new JTextArea();
        final JScrollPane scroll = new JScrollPane(ta);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                int lines = 0;
                String temp;
                final String pl = temp = String.valueOf(ta.getText()) + "  ";
                String[] songs = new String[0];
                while (temp.indexOf("https://open.spotify.com/track/") > -1) {
                    final String[] tempA = songs;
                    songs = new String[songs.length + 1];
                    songs[lines] = temp.substring(0, 53);
                    ++lines;
                    temp = temp.substring(54, temp.length());
                    for (int i = 0; i < tempA.length; ++i) {
                        songs[i] = tempA[i];
                    }
                }
                int removed = 0;
                for (int i = 0; i < songs.length; ++i) {
                    for (int j = 0; j < songs.length; ++j) {
                        if (songs[i].equals(songs[j]) && i != j) {
                            ++removed;
                            final String[] start = new String[j];
                            for (int k = 0; k < start.length; ++k) {
                                start[k] = songs[k];
                            }
                            final String[] end = new String[songs.length - j - 1];
                            for (int l = j + 1; l < songs.length; ++l) {
                                end[l - j - 1] = songs[l];
                            }
                            songs = new String[songs.length - 1];
                            for (int l = 0; l < start.length; ++l) {
                                songs[l] = start[l];
                            }
                            for (int l = j; l < songs.length; ++l) {
                                songs[l] = end[l - j];
                            }
                        }
                    }
                }
                String text = "";
                for (int m = 0; m < songs.length; ++m) {
                    text = String.valueOf(text) + songs[m] + "\n";
                }
                text = text.substring(0, text.length() - 1);
                ta.setText(text);
                label.setText("Removed " + removed + " duplicate songs");
            }
        });
        final JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            
            public void actionPerformed(final ActionEvent e) {
                ta.setText("");
            }
        });
        panel.add(label);
        panel.add(send);
        panel.add(reset);
        frame.add(scroll);
        frame.getContentPane().add("South", panel);
        frame.setVisible(true);
    }
}