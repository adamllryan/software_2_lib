Public Class ClickerGame
    Dim Clickers# = 0
    Dim Multiplier# = 10000000
    Dim Value# = 0
    Dim ClickerPrice# = 100
    Dim MultiplierPrice# = 20
    Dim ClickerSpeedPrice# = 200
    Dim ClickerSpeed# = 1000
    Dim ErrorTime# = Int((999 * Rnd()) + 1)
    Dim ClickerMultiplier# = 1
    Dim ClickerMultiplierPrice# = 1000

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles lblClick.Click


    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        Value = Value + 1 * Clickers * ClickerMultiplier
        btnValueCounter.Text = Value
    End Sub

    Private Sub btnValueCounter_Click(sender As Object, e As EventArgs) Handles btnValueCounter.Click
        Value = Value + 1 * Multiplier
        btnValueCounter.Text = Value
    End Sub

    Private Sub btnClickerBuy_Click(sender As Object, e As EventArgs) Handles btnClickerBuy.Click
        If Value >= ClickerPrice Then
            Clickers = Clickers + 1
            Value = Value - ClickerPrice
            ClickerPrice = ClickerPrice + ClickerPrice
            btnValueCounter.Text = Value
            btnClickerBuy.Text = "Clickers: " & Clickers & "Cost : " & ClickerPrice
        End If
    End Sub

    Private Sub btnMultiplierBuy_Click(sender As Object, e As EventArgs) Handles btnMultiplierBuy.Click
        If Value >= MultiplierPrice Then
            Multiplier = Multiplier + Multiplier
            Value = Value - MultiplierPrice
            MultiplierPrice = MultiplierPrice + MultiplierPrice
            btnValueCounter.Text = Value
            btnMultiplierBuy.Text = "Multiplier: " & Multiplier & "Cost : " & MultiplierPrice
        End If
    End Sub

    Private Sub btnClickerSpeedBuy_Click(sender As Object, e As EventArgs) Handles btnClickerSpeedBuy.Click
        If Value >= ClickerSpeedPrice And ClickerSpeed > 0 Then


            btnClickerSpeedBuy.Text = "ClickerSpeed: " & ClickerSpeed & "Cost : " & ClickerSpeedPrice
            If ClickerSpeed / 2 > 1 Then
                ClickerSpeed = ClickerSpeed / 2
                Value = Value - ClickerSpeedPrice
                ClickerSpeedPrice = ClickerSpeedPrice + ClickerSpeedPrice
                btnValueCounter.Text = Value
                Timer1.Interval = ClickerSpeed
            Else
                MessageBox.Show("Max Upgrades Purchased")
            End If
        End If
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles btnContinue.Click
        If txtName.Text <> String.Empty And txtName.Text <> "Error" Then
            lblClick.Visible = True
            lblClick.Text = "Click, " + txtName.Text
        Else
            MessageBox.Show("One or more fields have not been completed")
        End If

        If txtName.Text = "Error" Then
            Do
                MessageBox.Show("An Error has ocurred while attempting to open a window. Please wait " + ErrorTime + "long.")
                ErrorTime -= 1
            Loop Until ErrorTime < 1
        End If
        If txtName.Text = "Iriarte" Then
            Me.BackgroundImage = System.Drawing.Image.FromFile("My.Computer.FileSystem.CopyDirectory("C:\SourceDirectory", "D:\DestinationDirectory") ")
        End If

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnClickerMultiplierBuy.Click
        If Value >= ClickerMultiplierPrice Then
            ClickerMultiplier = ClickerMultiplier + ClickerMultiplier
            Value = Value - ClickerMultiplierPrice
            ClickerMultiplierPrice = ClickerMultiplierPrice + ClickerMultiplierPrice
            btnValueCounter.Text = Value
            btnClickerMultiplierBuy.Text = "Clicker Multiplier: " & ClickerMultiplier & "Cost : " & ClickerMultiplierPrice
        End If
    End Sub

    Private Sub txtName_TextChanged(sender As Object, e As EventArgs) Handles txtName.TextChanged

    End Sub
End Class
