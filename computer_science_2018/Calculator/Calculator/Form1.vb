'***************
'Adam Ryan
'Moga
'9/14/18
'Calculator
'***************
Public Class Form1
    Dim Op As Single
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles txtValue1.TextChanged

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnPlus.Click
        Op = 1
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnMinus.Click
        Op = 2
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles btnMultiply.Click
        Op = 3
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles btnDivide.Click
        Op = 4
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Op = 5
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles btnMod.Click
        Op = 6
    End Sub
    Private Sub Button1_Click_1(sender As Object, e As EventArgs) Handles btnExp.Click
        Op = 7
    End Sub

    Private Sub btnSubmit_Click(sender As Object, e As EventArgs) Handles btnSubmit.Click
        If Op = 0 Then
            MessageBox.Show("Operator has not been selected", "Error",
            MessageBoxButtons.OK, MessageBoxIcon.Error)
            
        Else
            If Op = 1 Then
                lblCalculation.Text = CDec(txtValue1.Text) + CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " + " & txtValue2.Text & " = ")
            End If
            If Op = 2 Then
                lblCalculation.Text = CDec(txtValue1.Text) - CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " - " & txtValue2.Text & " = ")
            End If
            If Op = 3 Then
                lblCalculation.Text = CDec(txtValue1.Text) * CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " * " & txtValue2.Text & " = ")
            End If
            If Op = 4 Then
                lblCalculation.Text = CDec(txtValue1.Text) / CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " / " & txtValue2.Text & " = ")
            End If
            If Op = 5 Then
                lblCalculation.Text = CDec(txtValue1.Text) \ CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " \ " & txtValue2.Text & " = ")
            End If
            If Op = 6 Then
                lblCalculation.Text = CDec(txtValue1.Text) Mod CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " Mod " & txtValue2.Text & " = ")
            End If
            If Op = 7 Then
                lblCalculation.Text = CDec(txtValue1.Text) ^ CDec(txtValue2.Text)
                lblLast.Text = CStr(txtValue1.Text & " ^ " & txtValue2.Text & " = ")
            End If
            txtValue1.Text = ""
            txtValue2.Text = ""
        End If
    End Sub

   
    Private Sub Button1_Click_2(sender As Object, e As EventArgs) Handles Button1.Click
        Me.Close()
    End Sub

    
End Class
