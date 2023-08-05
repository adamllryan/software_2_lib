<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class JokeProgram
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(JokeProgram))
        Me.btnDisplayJoke = New System.Windows.Forms.Button()
        Me.btnDisplayJoke2 = New System.Windows.Forms.Button()
        Me.btnDisplayPunchline = New System.Windows.Forms.Button()
        Me.btnDisplayPunchline2 = New System.Windows.Forms.Button()
        Me.lblJoke = New System.Windows.Forms.Label()
        Me.lblPunchline = New System.Windows.Forms.Label()
        Me.Jokes = New System.Data.DataSet()
        Me.Punchlines = New System.Data.DataSet()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        CType(Me.Jokes, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.Punchlines, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnDisplayJoke
        '
        Me.btnDisplayJoke.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDisplayJoke.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.btnDisplayJoke.Image = CType(resources.GetObject("btnDisplayJoke.Image"), System.Drawing.Image)
        Me.btnDisplayJoke.Location = New System.Drawing.Point(12, 27)
        Me.btnDisplayJoke.Name = "btnDisplayJoke"
        Me.btnDisplayJoke.Size = New System.Drawing.Size(169, 221)
        Me.btnDisplayJoke.TabIndex = 0
        Me.btnDisplayJoke.Text = "Display Joke"
        Me.btnDisplayJoke.UseVisualStyleBackColor = True
        '
        'btnDisplayJoke2
        '
        Me.btnDisplayJoke2.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDisplayJoke2.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.btnDisplayJoke2.Image = CType(resources.GetObject("btnDisplayJoke2.Image"), System.Drawing.Image)
        Me.btnDisplayJoke2.Location = New System.Drawing.Point(187, 27)
        Me.btnDisplayJoke2.Name = "btnDisplayJoke2"
        Me.btnDisplayJoke2.Size = New System.Drawing.Size(157, 221)
        Me.btnDisplayJoke2.TabIndex = 2
        Me.btnDisplayJoke2.Text = "Display Joke2"
        Me.btnDisplayJoke2.UseVisualStyleBackColor = True
        '
        'btnDisplayPunchline
        '
        Me.btnDisplayPunchline.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDisplayPunchline.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.btnDisplayPunchline.Image = CType(resources.GetObject("btnDisplayPunchline.Image"), System.Drawing.Image)
        Me.btnDisplayPunchline.Location = New System.Drawing.Point(12, 254)
        Me.btnDisplayPunchline.Name = "btnDisplayPunchline"
        Me.btnDisplayPunchline.Size = New System.Drawing.Size(169, 95)
        Me.btnDisplayPunchline.TabIndex = 3
        Me.btnDisplayPunchline.Text = "Display Punchline" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        Me.btnDisplayPunchline.UseVisualStyleBackColor = True
        '
        'btnDisplayPunchline2
        '
        Me.btnDisplayPunchline2.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDisplayPunchline2.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.btnDisplayPunchline2.Image = CType(resources.GetObject("btnDisplayPunchline2.Image"), System.Drawing.Image)
        Me.btnDisplayPunchline2.Location = New System.Drawing.Point(187, 254)
        Me.btnDisplayPunchline2.Name = "btnDisplayPunchline2"
        Me.btnDisplayPunchline2.Size = New System.Drawing.Size(157, 95)
        Me.btnDisplayPunchline2.TabIndex = 4
        Me.btnDisplayPunchline2.Text = "Display Punchline2"
        Me.btnDisplayPunchline2.UseVisualStyleBackColor = True
        '
        'lblJoke
        '
        Me.lblJoke.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblJoke.ForeColor = System.Drawing.SystemColors.ControlText
        Me.lblJoke.Location = New System.Drawing.Point(350, 27)
        Me.lblJoke.Name = "lblJoke"
        Me.lblJoke.Size = New System.Drawing.Size(277, 141)
        Me.lblJoke.TabIndex = 5
        Me.lblJoke.Text = "Joke"
        '
        'lblPunchline
        '
        Me.lblPunchline.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblPunchline.ForeColor = System.Drawing.SystemColors.ControlText
        Me.lblPunchline.Location = New System.Drawing.Point(350, 181)
        Me.lblPunchline.Name = "lblPunchline"
        Me.lblPunchline.Size = New System.Drawing.Size(277, 142)
        Me.lblPunchline.TabIndex = 6
        Me.lblPunchline.Text = "Punchline"
        '
        'Jokes
        '
        Me.Jokes.DataSetName = "Jokes"
        '
        'Punchlines
        '
        Me.Punchlines.DataSetName = "Punchlines"
        '
        'btnClear
        '
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.Location = New System.Drawing.Point(350, 326)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(133, 34)
        Me.btnClear.TabIndex = 7
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(489, 326)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(138, 34)
        Me.btnExit.TabIndex = 8
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'JokeProgram
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.ClientSize = New System.Drawing.Size(639, 361)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.lblPunchline)
        Me.Controls.Add(Me.lblJoke)
        Me.Controls.Add(Me.btnDisplayPunchline2)
        Me.Controls.Add(Me.btnDisplayPunchline)
        Me.Controls.Add(Me.btnDisplayJoke2)
        Me.Controls.Add(Me.btnDisplayJoke)
        Me.Name = "JokeProgram"
        Me.Text = "REALLY BAD JOKES"
        CType(Me.Jokes, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.Punchlines, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents btnDisplayJoke As System.Windows.Forms.Button
    Friend WithEvents btnDisplayJoke2 As System.Windows.Forms.Button
    Friend WithEvents btnDisplayPunchline As System.Windows.Forms.Button
    Friend WithEvents btnDisplayPunchline2 As System.Windows.Forms.Button
    Friend WithEvents lblJoke As System.Windows.Forms.Label
    Friend WithEvents lblPunchline As System.Windows.Forms.Label
    Friend WithEvents Jokes As System.Data.DataSet
    Friend WithEvents Punchlines As System.Data.DataSet
    Friend WithEvents btnClear As System.Windows.Forms.Button
    Friend WithEvents btnExit As System.Windows.Forms.Button

End Class
