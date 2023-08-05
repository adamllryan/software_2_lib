'*******************
'Adam Ryan
'Moga
'8/31/18
'Joke Maker
'*********************


Public Class JokeProgram









    Private Sub btnDisplayJoke_Click(sender As Object, e As EventArgs) Handles btnDisplayJoke.Click
        lblJoke.Text = "My boss yelled at me the other day, You’ve got to be the worst train driver in history. How many trains did you derail last year?"


    End Sub

    Private Sub btnDisplayPunchline_Click(sender As Object, e As EventArgs) Handles btnDisplayPunchline.Click
        lblPunchline.Text = "I said, Can’t say for sure, it’s so hard to keep track!"
        My.Computer.Audio.Play("S:\Laugh.wav",
                AudioPlayMode.Background)
    End Sub

    Private Sub btnDisplayJoke2_Click(sender As Object, e As EventArgs) Handles btnDisplayJoke2.Click
        lblJoke.Text = "What do you call cheese that is yours?"

    End Sub

    Private Sub btnDisplayPunchline2_Click(sender As Object, e As EventArgs) Handles btnDisplayPunchline2.Click
        lblPunchline.Text = "The governments"
        My.Computer.Audio.Play("S:\RUSSIA.wav",
    AudioPlayMode.Background)
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        lblJoke.Text = ""
        lblPunchline.Text = ""
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub JokeProgram_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub lblJoke_Click(sender As Object, e As EventArgs) Handles lblJoke.Click

    End Sub
End Class
