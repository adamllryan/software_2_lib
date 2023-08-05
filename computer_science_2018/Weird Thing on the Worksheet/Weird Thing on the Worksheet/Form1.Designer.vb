<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.lblABC = New System.Windows.Forms.Label()
        Me.lblXYZ = New System.Windows.Forms.Label()
        Me.lblResult = New System.Windows.Forms.Label()
        Me.lblAnswer = New System.Windows.Forms.Label()
        Me.lblDone = New System.Windows.Forms.Label()
        Me.lblFinish = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Button1
        '
        Me.Button1.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.Location = New System.Drawing.Point(149, 157)
        Me.Button1.Margin = New System.Windows.Forms.Padding(8, 7, 8, 7)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(200, 55)
        Me.Button1.TabIndex = 0
        Me.Button1.Text = "Calculate " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        Me.Button1.UseVisualStyleBackColor = True
        '
        'lblABC
        '
        Me.lblABC.AutoSize = True
        Me.lblABC.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblABC.Location = New System.Drawing.Point(35, 229)
        Me.lblABC.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblABC.Name = "lblABC"
        Me.lblABC.Size = New System.Drawing.Size(21, 31)
        Me.lblABC.TabIndex = 1
        Me.lblABC.Text = " "
        '
        'lblXYZ
        '
        Me.lblXYZ.AutoSize = True
        Me.lblXYZ.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblXYZ.Location = New System.Drawing.Point(35, 269)
        Me.lblXYZ.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblXYZ.Name = "lblXYZ"
        Me.lblXYZ.Size = New System.Drawing.Size(21, 31)
        Me.lblXYZ.TabIndex = 2
        Me.lblXYZ.Text = " "
        '
        'lblResult
        '
        Me.lblResult.AutoSize = True
        Me.lblResult.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblResult.Location = New System.Drawing.Point(35, 310)
        Me.lblResult.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblResult.Name = "lblResult"
        Me.lblResult.Size = New System.Drawing.Size(21, 31)
        Me.lblResult.TabIndex = 3
        Me.lblResult.Text = " "
        '
        'lblAnswer
        '
        Me.lblAnswer.AutoSize = True
        Me.lblAnswer.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblAnswer.Location = New System.Drawing.Point(35, 351)
        Me.lblAnswer.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblAnswer.Name = "lblAnswer"
        Me.lblAnswer.Size = New System.Drawing.Size(21, 31)
        Me.lblAnswer.TabIndex = 4
        Me.lblAnswer.Text = " "
        '
        'lblDone
        '
        Me.lblDone.AutoSize = True
        Me.lblDone.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblDone.Location = New System.Drawing.Point(35, 391)
        Me.lblDone.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblDone.Name = "lblDone"
        Me.lblDone.Size = New System.Drawing.Size(21, 31)
        Me.lblDone.TabIndex = 5
        Me.lblDone.Text = " "
        '
        'lblFinish
        '
        Me.lblFinish.AutoSize = True
        Me.lblFinish.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblFinish.Location = New System.Drawing.Point(35, 432)
        Me.lblFinish.Margin = New System.Windows.Forms.Padding(8, 0, 8, 0)
        Me.lblFinish.Name = "lblFinish"
        Me.lblFinish.Size = New System.Drawing.Size(21, 31)
        Me.lblFinish.TabIndex = 6
        Me.lblFinish.Text = " "
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(16.0!, 31.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(757, 622)
        Me.Controls.Add(Me.lblFinish)
        Me.Controls.Add(Me.lblDone)
        Me.Controls.Add(Me.lblAnswer)
        Me.Controls.Add(Me.lblResult)
        Me.Controls.Add(Me.lblXYZ)
        Me.Controls.Add(Me.lblABC)
        Me.Controls.Add(Me.Button1)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(8, 7, 8, 7)
        Me.Name = "Form1"
        Me.Text = " "
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents lblABC As System.Windows.Forms.Label
    Friend WithEvents lblXYZ As System.Windows.Forms.Label
    Friend WithEvents lblResult As System.Windows.Forms.Label
    Friend WithEvents lblAnswer As System.Windows.Forms.Label
    Friend WithEvents lblDone As System.Windows.Forms.Label
    Friend WithEvents lblFinish As System.Windows.Forms.Label

End Class
