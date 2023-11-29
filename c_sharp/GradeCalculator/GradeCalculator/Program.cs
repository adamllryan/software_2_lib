double[] weights = { .1, .1, .1 , .1, .1, .2, .25, .05};
Console.Write("Input File Path: ");
var path = Console.ReadLine(); // /Users/adam/Projects/GradeCalculator/GradeCalculator/grades.txt
string[] lines = File.ReadAllLines(path);
Console.Write("GPA By Student: \n");
foreach (string line in lines[1..]) //get grade per student, ignore first txt file line
{
    string[] items = line.Split(" "); //split by spaces
    var scores = Array.ConvertAll(items[1..], c => int.Parse(c)); //convert all to int (only numbers
    double score = 0;
    for (int i = 0; i<weights.Length; i++ )
    {
        score += scores[i] * weights[i]; //get final score after factoring in weight
    }
    Console.WriteLine(items[0] + " got a(n) " + getGPA(score)); //print out all results
}
string getGPA(double score)
{
    switch (score)
    {
        case >= 93:
            return"A";
        case >= 90:
            return "A-";
        case >= 87:
            return "B+";
        case >= 83:
            return "B";
        case >= 80:
            return "B-";
        case >= 77:
            return "C+";
        case >= 73:
            return "C";
        case >= 70:
            return "C-";
        case >= 67:
            return "D+";
        case >= 60:
            return "D";
        default:
            return "E";
    }
}