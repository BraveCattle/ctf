.class public abstract Lp/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp/d;


# instance fields
.field public a:I

.field public b:Lo/e;

.field public c:Lp/k;

.field public d:I

.field public e:Lp/g;

.field public f:I

.field public g:Z

.field public h:Lp/f;

.field public i:Lp/f;

.field public j:I


# direct methods
.method public constructor <init>(Lo/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp/g;

    invoke-direct {v0, p0}, Lp/g;-><init>(Lp/m;)V

    iput-object v0, p0, Lp/m;->e:Lp/g;

    const/4 v0, 0x0

    iput v0, p0, Lp/m;->f:I

    iput-boolean v0, p0, Lp/m;->g:Z

    new-instance v0, Lp/f;

    invoke-direct {v0, p0}, Lp/f;-><init>(Lp/m;)V

    iput-object v0, p0, Lp/m;->h:Lp/f;

    new-instance v0, Lp/f;

    invoke-direct {v0, p0}, Lp/f;-><init>(Lp/m;)V

    iput-object v0, p0, Lp/m;->i:Lp/f;

    const/4 v0, 0x1

    iput v0, p0, Lp/m;->j:I

    iput-object p1, p0, Lp/m;->b:Lo/e;

    return-void
.end method


# virtual methods
.method public a(Lp/d;)V
    .locals 0

    return-void
.end method

.method public final b(Lp/f;Lp/f;I)V
    .locals 1

    iget-object v0, p1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp/f;->f:I

    iget-object p2, p2, Lp/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lp/f;Lp/f;ILp/g;)V
    .locals 2

    iget-object v0, p1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lp/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp/f;->h:I

    iput-object p4, p1, Lp/f;->i:Lp/g;

    iget-object p2, p2, Lp/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Lp/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, Lp/m;->b:Lo/e;

    iget v0, p2, Lo/e;->n:I

    iget p2, p2, Lo/e;->m:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lp/m;->b:Lo/e;

    iget v0, p2, Lo/e;->q:I

    iget p2, p2, Lo/e;->p:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method public final h(Lo/d;)Lp/f;
    .locals 3

    iget-object p1, p1, Lo/d;->d:Lo/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lo/d;->b:Lo/e;

    iget-object p1, p1, Lo/d;->c:Lo/d$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, v1, Lo/e;->e:Lp/l;

    iget-object v0, p1, Lp/l;->k:Lp/f;

    goto :goto_2

    :cond_2
    iget-object p1, v1, Lo/e;->e:Lp/l;

    goto :goto_0

    :cond_3
    iget-object p1, v1, Lo/e;->d:Lp/j;

    :goto_0
    iget-object v0, p1, Lp/m;->i:Lp/f;

    goto :goto_2

    :cond_4
    iget-object p1, v1, Lo/e;->e:Lp/l;

    goto :goto_1

    :cond_5
    iget-object p1, v1, Lo/e;->d:Lp/j;

    :goto_1
    iget-object v0, p1, Lp/m;->h:Lp/f;

    :goto_2
    return-object v0
.end method

.method public final i(Lo/d;I)Lp/f;
    .locals 2

    iget-object p1, p1, Lo/d;->d:Lo/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lo/d;->b:Lo/e;

    if-nez p2, :cond_1

    iget-object p2, v1, Lo/e;->d:Lp/j;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lo/e;->e:Lp/l;

    :goto_0
    iget-object p1, p1, Lo/d;->c:Lo/d$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, Lp/m;->i:Lp/f;

    goto :goto_1

    :cond_3
    iget-object v0, p2, Lp/m;->h:Lp/f;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-boolean v1, v0, Lp/f;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lp/f;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract k()Z
.end method

.method public l(Lo/d;Lo/d;I)V
    .locals 12

    invoke-virtual {p0, p1}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    invoke-virtual {p0, p2}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v1

    iget-boolean v2, v0, Lp/f;->j:Z

    if-eqz v2, :cond_f

    iget-boolean v2, v1, Lp/f;->j:Z

    if-nez v2, :cond_0

    goto/16 :goto_6

    :cond_0
    iget v2, v0, Lp/f;->g:I

    invoke-virtual {p1}, Lo/d;->b()I

    move-result p1

    add-int/2addr p1, v2

    iget v2, v1, Lp/f;->g:I

    invoke-virtual {p2}, Lo/d;->b()I

    move-result p2

    sub-int/2addr v2, p2

    sub-int p2, v2, p1

    iget-object v3, p0, Lp/m;->e:Lp/g;

    iget-boolean v4, v3, Lp/f;->j:Z

    const/high16 v5, 0x3f000000    # 0.5f

    if-nez v4, :cond_a

    iget v4, p0, Lp/m;->d:I

    const/4 v6, 0x3

    if-ne v4, v6, :cond_a

    .line 1
    iget v4, p0, Lp/m;->a:I

    if-eqz v4, :cond_9

    const/4 v7, 0x1

    if-eq v4, v7, :cond_8

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    if-eq v4, v6, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v4, p0, Lp/m;->b:Lo/e;

    iget-object v8, v4, Lo/e;->d:Lp/j;

    iget v9, v8, Lp/m;->d:I

    if-ne v9, v6, :cond_2

    iget v9, v8, Lp/m;->a:I

    if-ne v9, v6, :cond_2

    iget-object v9, v4, Lo/e;->e:Lp/l;

    iget v10, v9, Lp/m;->d:I

    if-ne v10, v6, :cond_2

    iget v9, v9, Lp/m;->a:I

    if-ne v9, v6, :cond_2

    goto :goto_4

    :cond_2
    if-nez p3, :cond_3

    iget-object v8, v4, Lo/e;->e:Lp/l;

    :cond_3
    iget-object v6, v8, Lp/m;->e:Lp/g;

    iget-boolean v8, v6, Lp/f;->j:Z

    if-eqz v8, :cond_a

    .line 2
    iget v4, v4, Lo/e;->N:F

    if-ne p3, v7, :cond_4

    .line 3
    iget v6, v6, Lp/f;->g:I

    int-to-float v6, v6

    div-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    goto :goto_3

    :cond_4
    iget v6, v6, Lp/f;->g:I

    int-to-float v6, v6

    mul-float/2addr v4, v6

    add-float/2addr v4, v5

    float-to-int v4, v4

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lp/m;->b:Lo/e;

    .line 4
    iget-object v6, v4, Lo/e;->K:Lo/e;

    if-eqz v6, :cond_a

    if-nez p3, :cond_6

    .line 5
    iget-object v6, v6, Lo/e;->d:Lp/j;

    goto :goto_0

    :cond_6
    iget-object v6, v6, Lo/e;->e:Lp/l;

    :goto_0
    iget-object v6, v6, Lp/m;->e:Lp/g;

    iget-boolean v7, v6, Lp/f;->j:Z

    if-eqz v7, :cond_a

    if-nez p3, :cond_7

    iget v4, v4, Lo/e;->o:F

    goto :goto_1

    :cond_7
    iget v4, v4, Lo/e;->r:F

    :goto_1
    iget v6, v6, Lp/f;->g:I

    int-to-float v6, v6

    mul-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    goto :goto_2

    :cond_8
    iget v3, v3, Lp/g;->m:I

    invoke-virtual {p0, v3, p3}, Lp/m;->g(II)I

    move-result v3

    iget-object v4, p0, Lp/m;->e:Lp/g;

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    move-object v11, v4

    move v4, v3

    move-object v3, v11

    goto :goto_3

    :cond_9
    move v4, p2

    :goto_2
    invoke-virtual {p0, v4, p3}, Lp/m;->g(II)I

    move-result v4

    :goto_3
    invoke-virtual {v3, v4}, Lp/g;->c(I)V

    .line 6
    :cond_a
    :goto_4
    iget-object v3, p0, Lp/m;->e:Lp/g;

    iget-boolean v4, v3, Lp/f;->j:Z

    if-nez v4, :cond_b

    return-void

    :cond_b
    iget v3, v3, Lp/f;->g:I

    if-ne v3, p2, :cond_c

    iget-object p2, p0, Lp/m;->h:Lp/f;

    invoke-virtual {p2, p1}, Lp/f;->c(I)V

    iget-object p1, p0, Lp/m;->i:Lp/f;

    invoke-virtual {p1, v2}, Lp/f;->c(I)V

    return-void

    :cond_c
    iget-object p2, p0, Lp/m;->b:Lo/e;

    if-nez p3, :cond_d

    .line 7
    iget p2, p2, Lo/e;->U:F

    goto :goto_5

    .line 8
    :cond_d
    iget p2, p2, Lo/e;->V:F

    :goto_5
    if-ne v0, v1, :cond_e

    .line 9
    iget p1, v0, Lp/f;->g:I

    iget v2, v1, Lp/f;->g:I

    move p2, v5

    :cond_e
    sub-int/2addr v2, p1

    sub-int/2addr v2, v3

    iget-object p3, p0, Lp/m;->h:Lp/f;

    int-to-float p1, p1

    add-float/2addr p1, v5

    int-to-float v0, v2

    mul-float/2addr v0, p2

    add-float/2addr v0, p1

    float-to-int p1, v0

    invoke-virtual {p3, p1}, Lp/f;->c(I)V

    iget-object p1, p0, Lp/m;->i:Lp/f;

    iget-object p2, p0, Lp/m;->h:Lp/f;

    iget p2, p2, Lp/f;->g:I

    iget-object p3, p0, Lp/m;->e:Lp/g;

    iget p3, p3, Lp/f;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Lp/f;->c(I)V

    :cond_f
    :goto_6
    return-void
.end method