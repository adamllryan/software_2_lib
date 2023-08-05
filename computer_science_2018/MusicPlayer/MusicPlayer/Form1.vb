Public Class SmashPlayer

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        My.Computer.Audio.Play("S:\SmashBrawl.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        My.Computer.Audio.Play("S:\SmashBrawlLoud.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        My.Computer.Audio.Play("S:\Smash64.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        My.Computer.Audio.Play("S:\SmashMelee.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        My.Computer.Audio.Play("S:\Smash4.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        My.Computer.Audio.Play("S:\SmashUltimate.wav",
   AudioPlayMode.BackgroundLoop)
    End Sub
End Class
