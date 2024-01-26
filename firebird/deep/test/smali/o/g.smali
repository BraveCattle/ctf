.class public Lo/g;
.super Lo/e;
.source ""


# instance fields
.field public e0:F

.field public f0:I

.field public g0:I

.field public h0:Lo/d;

.field public i0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lo/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/g;->e0:F

    const/4 v0, -0x1

    iput v0, p0, Lo/g;->f0:I

    iput v0, p0, Lo/g;->g0:I

    iget-object v0, p0, Lo/e;->z:Lo/d;

    iput-object v0, p0, Lo/g;->h0:Lo/d;

    const/4 v0, 0x0

    iput v0, p0, Lo/g;->i0:I

    iget-object v1, p0, Lo/e;->H:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lo/e;->H:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lo/e;->G:[Lo/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lo/e;->G:[Lo/d;

    iget-object v3, p0, Lo/g;->h0:Lo/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public D(Ln/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo/e;->K:Lo/e;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {p1, v0}, Ln/d;->o(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, Lo/g;->i0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 3
    iput p1, p0, Lo/e;->P:I

    .line 4
    iput v2, p0, Lo/e;->Q:I

    .line 5
    iget-object p1, p0, Lo/e;->K:Lo/e;

    .line 6
    invoke-virtual {p1}, Lo/e;->i()I

    move-result p1

    invoke-virtual {p0, p1}, Lo/e;->w(I)V

    invoke-virtual {p0, v2}, Lo/e;->B(I)V

    goto :goto_0

    .line 7
    :cond_1
    iput v2, p0, Lo/e;->P:I

    .line 8
    iput p1, p0, Lo/e;->Q:I

    .line 9
    iget-object p1, p0, Lo/e;->K:Lo/e;

    .line 10
    invoke-virtual {p1}, Lo/e;->o()I

    move-result p1

    invoke-virtual {p0, p1}, Lo/e;->B(I)V

    invoke-virtual {p0, v2}, Lo/e;->w(I)V

    :goto_0
    return-void
.end method

.method public E(I)V
    .locals 3

    iget v0, p0, Lo/g;->i0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lo/g;->i0:I

    iget-object p1, p0, Lo/e;->H:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lo/g;->i0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lo/e;->y:Lo/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo/e;->z:Lo/d;

    :goto_0
    iput-object p1, p0, Lo/g;->h0:Lo/d;

    iget-object p1, p0, Lo/e;->H:Ljava/util/ArrayList;

    iget-object v0, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo/e;->G:[Lo/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lo/e;->G:[Lo/d;

    iget-object v2, p0, Lo/g;->h0:Lo/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public b(Ln/d;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lo/e;->K:Lo/e;

    .line 2
    check-cast v0, Lo/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lo/d$a;->a:Lo/d$a;

    invoke-virtual {v0, v1}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    sget-object v2, Lo/d$a;->c:Lo/d$a;

    invoke-virtual {v0, v2}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v2

    iget-object v3, p0, Lo/e;->K:Lo/e;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v3, Lo/e;->J:[I

    aget v3, v3, v5

    if-ne v3, v6, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    iget v7, p0, Lo/g;->i0:I

    if-nez v7, :cond_3

    sget-object v1, Lo/d$a;->b:Lo/d$a;

    invoke-virtual {v0, v1}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    sget-object v2, Lo/d$a;->d:Lo/d$a;

    invoke-virtual {v0, v2}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v2

    iget-object v0, p0, Lo/e;->K:Lo/e;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lo/e;->J:[I

    aget v0, v0, v4

    if-ne v0, v6, :cond_2

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    move v3, v4

    :cond_3
    iget v0, p0, Lo/g;->f0:I

    const/16 v4, 0x8

    const/4 v6, -0x1

    const/4 v7, 0x5

    if-eq v0, v6, :cond_4

    iget-object v0, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {p1, v0}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v0

    invoke-virtual {p1, v1}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v1

    iget v6, p0, Lo/g;->f0:I

    invoke-virtual {p1, v0, v1, v6, v4}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    if-eqz v3, :cond_6

    invoke-virtual {p1, v2}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v5, v7}, Ln/d;->f(Ln/h;Ln/h;II)V

    goto :goto_2

    :cond_4
    iget v0, p0, Lo/g;->g0:I

    if-eq v0, v6, :cond_5

    iget-object v0, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {p1, v0}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v0

    invoke-virtual {p1, v2}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v2

    iget v6, p0, Lo/g;->g0:I

    neg-int v6, v6

    invoke-virtual {p1, v0, v2, v6, v4}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    if-eqz v3, :cond_6

    invoke-virtual {p1, v1}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v5, v7}, Ln/d;->f(Ln/h;Ln/h;II)V

    invoke-virtual {p1, v2, v0, v5, v7}, Ln/d;->f(Ln/h;Ln/h;II)V

    goto :goto_2

    :cond_5
    iget v0, p0, Lo/g;->e0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/g;->h0:Lo/d;

    invoke-virtual {p1, v0}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v0

    invoke-virtual {p1, v2}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v2

    iget v3, p0, Lo/g;->e0:F

    .line 3
    invoke-virtual {p1}, Ln/d;->m()Ln/b;

    move-result-object v4

    .line 4
    iget-object v5, v4, Ln/b;->d:Ln/b$a;

    invoke-interface {v5, v0, v1}, Ln/b$a;->e(Ln/h;F)V

    iget-object v0, v4, Ln/b;->d:Ln/b$a;

    invoke-interface {v0, v2, v3}, Ln/b$a;->e(Ln/h;F)V

    .line 5
    invoke-virtual {p1, v4}, Ln/d;->c(Ln/b;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f(Lo/d$a;)Lo/d;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget v0, p0, Lo/g;->i0:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lo/g;->h0:Lo/d;

    return-object p1

    :pswitch_1
    iget v0, p0, Lo/g;->i0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lo/g;->h0:Lo/d;

    return-object p1

    :pswitch_2
    const/4 p1, 0x0

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
