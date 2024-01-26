.class public Landroidx/constraintlayout/widget/a;
.super Landroidx/constraintlayout/widget/b;
.source ""


# instance fields
.field public h:I

.field public i:I

.field public j:Lo/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/b;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public e(Landroid/util/AttributeSet;)V
    .locals 0

    new-instance p1, Lo/a;

    invoke-direct {p1}, Lo/a;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/a;->j:Lo/a;

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/b;->e:Lo/h;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/b;->g()V

    return-void
.end method

.method public f(Lo/e;Z)V
    .locals 3

    iget v0, p0, Landroidx/constraintlayout/widget/a;->h:I

    .line 1
    iput v0, p0, Landroidx/constraintlayout/widget/a;->i:I

    const/4 v1, 0x6

    const/4 v2, 0x5

    if-eqz p2, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_2

    :cond_0
    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_1
    if-ne v0, v2, :cond_2

    :goto_0
    const/4 p2, 0x0

    :goto_1
    iput p2, p0, Landroidx/constraintlayout/widget/a;->i:I

    goto :goto_3

    :cond_2
    if-ne v0, v1, :cond_3

    :goto_2
    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    instance-of p2, p1, Lo/a;

    if-eqz p2, :cond_4

    check-cast p1, Lo/a;

    iget p2, p0, Landroidx/constraintlayout/widget/a;->i:I

    .line 2
    iput p2, p1, Lo/a;->g0:I

    :cond_4
    return-void
.end method

.method public getMargin()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/a;->j:Lo/a;

    .line 1
    iget v0, v0, Lo/a;->i0:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/a;->h:I

    return v0
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/a;->j:Lo/a;

    .line 1
    iput-boolean p1, v0, Lo/a;->h0:Z

    return-void
.end method

.method public setDpMargin(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Landroidx/constraintlayout/widget/a;->j:Lo/a;

    .line 1
    iput p1, v0, Lo/a;->i0:I

    return-void
.end method

.method public setMargin(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/a;->j:Lo/a;

    .line 1
    iput p1, v0, Lo/a;->i0:I

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/widget/a;->h:I

    return-void
.end method
