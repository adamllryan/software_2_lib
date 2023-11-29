using System.Text;
using System.Windows.Forms;
class Program
{
    [System.STAThread]
    static void Main(string[] args)
    {
        StringBuilder data = Clipboard.GetText();
    }
}