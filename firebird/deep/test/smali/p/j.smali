.class public Lp/j;
.super Lp/m;
.source ""


# static fields
.field public static k:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lp/j;->k:[I

    return-void
.end method

.method public constructor <init>(Lo/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lp/m;-><init>(Lo/e;)V

    iget-object p1, p0, Lp/m;->h:Lp/f;

    sget-object v0, Lp/f$a;->d:Lp/f$a;

    iput-object v0, p1, Lp/f;->e:Lp/f$a;

    iget-object p1, p0, Lp/m;->i:Lp/f;

    sget-object v0, Lp/f$a;->e:Lp/f$a;

    iput-object v0, p1, Lp/f;->e:Lp/f$a;

    const/4 p1, 0x0

    iput p1, p0, Lp/m;->f:I

    return-void
.end method


# virtual methods
.method public a(Lp/d;)V
    .locals 18

    move-object/from16 v8, p0

    iget v0, v8, Lp/m;->j:I

    invoke-static {v0}, Ln/g;->a(I)I

    move-result v0

    const/4 v9, 0x3

    const/4 v10, 0x0

    if-eq v0, v9, :cond_27

    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget-boolean v1, v0, Lp/f;->j:Z

    const/high16 v11, 0x3f000000    # 0.5f

    const/4 v12, 0x1

    if-nez v1, :cond_1e

    iget v1, v8, Lp/m;->d:I

    if-ne v1, v9, :cond_1e

    iget-object v1, v8, Lp/m;->b:Lo/e;

    iget v2, v1, Lo/e;->j:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1d

    if-eq v2, v9, :cond_0

    goto/16 :goto_f

    :cond_0
    iget v2, v1, Lo/e;->k:I

    const/4 v3, -0x1

    if-eqz v2, :cond_4

    if-ne v2, v9, :cond_1

    goto :goto_0

    .line 1
    :cond_1
    iget v2, v1, Lo/e;->O:I

    if-eq v2, v3, :cond_3

    if-eqz v2, :cond_2

    if-eq v2, v12, :cond_3

    move v1, v10

    goto/16 :goto_e

    .line 2
    :cond_2
    iget-object v2, v1, Lo/e;->e:Lp/l;

    iget-object v2, v2, Lp/m;->e:Lp/g;

    iget v2, v2, Lp/f;->g:I

    int-to-float v2, v2

    .line 3
    iget v1, v1, Lo/e;->N:F

    div-float/2addr v2, v1

    goto/16 :goto_d

    .line 4
    :cond_3
    iget-object v2, v1, Lo/e;->e:Lp/l;

    iget-object v2, v2, Lp/m;->e:Lp/g;

    iget v2, v2, Lp/f;->g:I

    int-to-float v2, v2

    .line 5
    iget v1, v1, Lo/e;->N:F

    mul-float/2addr v2, v1

    goto/16 :goto_d

    .line 6
    :cond_4
    :goto_0
    iget-object v0, v1, Lo/e;->e:Lp/l;

    iget-object v13, v0, Lp/m;->h:Lp/f;

    iget-object v14, v0, Lp/m;->i:Lp/f;

    iget-object v0, v1, Lo/e;->y:Lo/d;

    iget-object v0, v0, Lo/d;->d:Lo/d;

    if-eqz v0, :cond_5

    move v0, v12

    goto :goto_1

    :cond_5
    move v0, v10

    :goto_1
    iget-object v2, v1, Lo/e;->z:Lo/d;

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_6

    move v2, v12

    goto :goto_2

    :cond_6
    move v2, v10

    :goto_2
    iget-object v4, v1, Lo/e;->A:Lo/d;

    iget-object v4, v4, Lo/d;->d:Lo/d;

    if-eqz v4, :cond_7

    move v4, v12

    goto :goto_3

    :cond_7
    move v4, v10

    :goto_3
    iget-object v5, v1, Lo/e;->B:Lo/d;

    iget-object v5, v5, Lo/d;->d:Lo/d;

    if-eqz v5, :cond_8

    move v5, v12

    goto :goto_4

    :cond_8
    move v5, v10

    .line 7
    :goto_4
    iget v15, v1, Lo/e;->O:I

    if-eqz v0, :cond_11

    if-eqz v2, :cond_11

    if-eqz v4, :cond_11

    if-eqz v5, :cond_11

    .line 8
    iget v7, v1, Lo/e;->N:F

    .line 9
    iget-boolean v0, v13, Lp/f;->j:Z

    if-eqz v0, :cond_b

    iget-boolean v0, v14, Lp/f;->j:Z

    if-eqz v0, :cond_b

    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-boolean v1, v0, Lp/f;->c:Z

    if-eqz v1, :cond_a

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-boolean v1, v1, Lp/f;->c:Z

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v1, v8, Lp/m;->h:Lp/f;

    iget v1, v1, Lp/f;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget v1, v1, Lp/f;->f:I

    sub-int v3, v0, v1

    iget v0, v13, Lp/f;->g:I

    iget v1, v13, Lp/f;->f:I

    add-int v4, v0, v1

    iget v0, v14, Lp/f;->g:I

    iget v1, v14, Lp/f;->f:I

    sub-int v5, v0, v1

    sget-object v9, Lp/j;->k:[I

    move-object/from16 v0, p0

    move-object v1, v9

    move v6, v7

    move v7, v15

    invoke-virtual/range {v0 .. v7}, Lp/j;->m([IIIIIFI)V

    iget-object v0, v8, Lp/m;->e:Lp/g;

    aget v1, v9, v10

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    aget v1, v9, v12

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    :cond_a
    :goto_5
    return-void

    :cond_b
    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-boolean v1, v0, Lp/f;->j:Z

    if-eqz v1, :cond_e

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-boolean v2, v1, Lp/f;->j:Z

    if-eqz v2, :cond_e

    iget-boolean v2, v13, Lp/f;->c:Z

    if-eqz v2, :cond_d

    iget-boolean v2, v14, Lp/f;->c:Z

    if-nez v2, :cond_c

    goto :goto_6

    :cond_c
    iget v2, v0, Lp/f;->g:I

    iget v0, v0, Lp/f;->f:I

    add-int/2addr v2, v0

    iget v0, v1, Lp/f;->g:I

    iget v1, v1, Lp/f;->f:I

    sub-int v3, v0, v1

    iget-object v0, v13, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget v1, v13, Lp/f;->f:I

    add-int v4, v0, v1

    iget-object v0, v14, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget v1, v14, Lp/f;->f:I

    sub-int v5, v0, v1

    sget-object v16, Lp/j;->k:[I

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move v6, v7

    move/from16 v17, v7

    move v7, v15

    invoke-virtual/range {v0 .. v7}, Lp/j;->m([IIIIIFI)V

    iget-object v0, v8, Lp/m;->e:Lp/g;

    aget v1, v16, v10

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    aget v1, v16, v12

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    goto :goto_7

    :cond_d
    :goto_6
    return-void

    :cond_e
    move/from16 v17, v7

    :goto_7
    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-boolean v1, v0, Lp/f;->c:Z

    if-eqz v1, :cond_10

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-boolean v1, v1, Lp/f;->c:Z

    if-eqz v1, :cond_10

    iget-boolean v1, v13, Lp/f;->c:Z

    if-eqz v1, :cond_10

    iget-boolean v1, v14, Lp/f;->c:Z

    if-nez v1, :cond_f

    goto :goto_8

    :cond_f
    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v1, v8, Lp/m;->h:Lp/f;

    iget v1, v1, Lp/f;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget v1, v1, Lp/f;->f:I

    sub-int v3, v0, v1

    iget-object v0, v13, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget v1, v13, Lp/f;->f:I

    add-int v4, v0, v1

    iget-object v0, v14, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget v1, v14, Lp/f;->f:I

    sub-int v5, v0, v1

    sget-object v13, Lp/j;->k:[I

    move-object/from16 v0, p0

    move-object v1, v13

    move/from16 v6, v17

    move v7, v15

    invoke-virtual/range {v0 .. v7}, Lp/j;->m([IIIIIFI)V

    iget-object v0, v8, Lp/m;->e:Lp/g;

    aget v1, v13, v10

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    aget v1, v13, v12

    goto/16 :goto_e

    :cond_10
    :goto_8
    return-void

    :cond_11
    if-eqz v0, :cond_17

    if-eqz v4, :cond_17

    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-boolean v2, v0, Lp/f;->c:Z

    if-eqz v2, :cond_16

    iget-object v2, v8, Lp/m;->i:Lp/f;

    iget-boolean v2, v2, Lp/f;->c:Z

    if-nez v2, :cond_12

    goto :goto_a

    .line 10
    :cond_12
    iget v1, v1, Lo/e;->N:F

    .line 11
    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v2, v8, Lp/m;->h:Lp/f;

    iget v2, v2, Lp/f;->f:I

    add-int/2addr v0, v2

    iget-object v2, v8, Lp/m;->i:Lp/f;

    iget-object v2, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/f;

    iget v2, v2, Lp/f;->g:I

    iget-object v4, v8, Lp/m;->i:Lp/f;

    iget v4, v4, Lp/f;->f:I

    sub-int/2addr v2, v4

    if-eq v15, v3, :cond_14

    if-eqz v15, :cond_14

    if-eq v15, v12, :cond_13

    goto/16 :goto_f

    :cond_13
    sub-int/2addr v2, v0

    invoke-virtual {v8, v2, v10}, Lp/m;->g(II)I

    move-result v0

    int-to-float v2, v0

    div-float/2addr v2, v1

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v12}, Lp/m;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_15

    int-to-float v0, v3

    mul-float/2addr v0, v1

    goto :goto_9

    :cond_14
    sub-int/2addr v2, v0

    invoke-virtual {v8, v2, v10}, Lp/m;->g(II)I

    move-result v0

    int-to-float v2, v0

    mul-float/2addr v2, v1

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v12}, Lp/m;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_15

    int-to-float v0, v3

    div-float/2addr v0, v1

    :goto_9
    add-float/2addr v0, v11

    float-to-int v0, v0

    :cond_15
    iget-object v1, v8, Lp/m;->e:Lp/g;

    invoke-virtual {v1, v0}, Lp/g;->c(I)V

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    invoke-virtual {v0, v3}, Lp/g;->c(I)V

    goto/16 :goto_f

    :cond_16
    :goto_a
    return-void

    :cond_17
    if-eqz v2, :cond_1e

    if-eqz v5, :cond_1e

    iget-boolean v0, v13, Lp/f;->c:Z

    if-eqz v0, :cond_1c

    iget-boolean v0, v14, Lp/f;->c:Z

    if-nez v0, :cond_18

    goto :goto_c

    .line 12
    :cond_18
    iget v0, v1, Lo/e;->N:F

    .line 13
    iget-object v1, v13, Lp/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/f;

    iget v1, v1, Lp/f;->g:I

    iget v2, v13, Lp/f;->f:I

    add-int/2addr v1, v2

    iget-object v2, v14, Lp/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/f;

    iget v2, v2, Lp/f;->g:I

    iget v4, v14, Lp/f;->f:I

    sub-int/2addr v2, v4

    if-eq v15, v3, :cond_1a

    if-eqz v15, :cond_19

    if-eq v15, v12, :cond_1a

    goto :goto_f

    :cond_19
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v12}, Lp/m;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, Lp/m;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1b

    int-to-float v1, v3

    div-float/2addr v1, v0

    goto :goto_b

    :cond_1a
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v12}, Lp/m;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, Lp/m;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1b

    int-to-float v1, v3

    mul-float/2addr v1, v0

    :goto_b
    add-float/2addr v1, v11

    float-to-int v1, v1

    :cond_1b
    iget-object v0, v8, Lp/m;->e:Lp/g;

    invoke-virtual {v0, v3}, Lp/g;->c(I)V

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    goto :goto_e

    :cond_1c
    :goto_c
    return-void

    .line 14
    :cond_1d
    iget-object v2, v1, Lo/e;->K:Lo/e;

    if-eqz v2, :cond_1e

    .line 15
    iget-object v2, v2, Lo/e;->d:Lp/j;

    iget-object v2, v2, Lp/m;->e:Lp/g;

    iget-boolean v3, v2, Lp/f;->j:Z

    if-eqz v3, :cond_1e

    iget v1, v1, Lo/e;->o:F

    iget v2, v2, Lp/f;->g:I

    int-to-float v2, v2

    mul-float/2addr v2, v1

    :goto_d
    add-float/2addr v2, v11

    float-to-int v1, v2

    :goto_e
    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    :cond_1e
    :goto_f
    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-boolean v1, v0, Lp/f;->c:Z

    if-eqz v1, :cond_26

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-boolean v2, v1, Lp/f;->c:Z

    if-nez v2, :cond_1f

    goto/16 :goto_11

    :cond_1f
    iget-boolean v0, v0, Lp/f;->j:Z

    if-eqz v0, :cond_20

    iget-boolean v0, v1, Lp/f;->j:Z

    if-eqz v0, :cond_20

    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget-boolean v0, v0, Lp/f;->j:Z

    if-eqz v0, :cond_20

    return-void

    :cond_20
    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget-boolean v0, v0, Lp/f;->j:Z

    if-nez v0, :cond_21

    iget v0, v8, Lp/m;->d:I

    if-ne v0, v9, :cond_21

    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget v1, v0, Lo/e;->j:I

    if-nez v1, :cond_21

    invoke-virtual {v0}, Lo/e;->s()Z

    move-result v0

    if-nez v0, :cond_21

    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-object v1, v1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v2, v8, Lp/m;->h:Lp/f;

    iget v3, v2, Lp/f;->f:I

    add-int/2addr v0, v3

    iget v1, v1, Lp/f;->g:I

    iget-object v3, v8, Lp/m;->i:Lp/f;

    iget v3, v3, Lp/f;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, Lp/f;->c(I)V

    iget-object v0, v8, Lp/m;->i:Lp/f;

    invoke-virtual {v0, v1}, Lp/f;->c(I)V

    iget-object v0, v8, Lp/m;->e:Lp/g;

    invoke-virtual {v0, v3}, Lp/g;->c(I)V

    return-void

    :cond_21
    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget-boolean v0, v0, Lp/f;->j:Z

    if-nez v0, :cond_23

    iget v0, v8, Lp/m;->d:I

    if-ne v0, v9, :cond_23

    iget v0, v8, Lp/m;->a:I

    if-ne v0, v12, :cond_23

    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_23

    iget-object v0, v8, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_23

    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-object v1, v1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/f;

    iget v0, v0, Lp/f;->g:I

    iget-object v2, v8, Lp/m;->h:Lp/f;

    iget v2, v2, Lp/f;->f:I

    add-int/2addr v0, v2

    iget v1, v1, Lp/f;->g:I

    iget-object v2, v8, Lp/m;->i:Lp/f;

    iget v2, v2, Lp/f;->f:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget v0, v0, Lp/g;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, v8, Lp/m;->b:Lo/e;

    iget v2, v1, Lo/e;->n:I

    iget v1, v1, Lo/e;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v2, :cond_22

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_22
    iget-object v1, v8, Lp/m;->e:Lp/g;

    invoke-virtual {v1, v0}, Lp/g;->c(I)V

    :cond_23
    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget-boolean v0, v0, Lp/f;->j:Z

    if-nez v0, :cond_24

    return-void

    :cond_24
    iget-object v0, v8, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    iget-object v1, v8, Lp/m;->i:Lp/f;

    iget-object v1, v1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/f;

    iget v2, v0, Lp/f;->g:I

    iget-object v3, v8, Lp/m;->h:Lp/f;

    iget v4, v3, Lp/f;->f:I

    add-int/2addr v4, v2

    iget v5, v1, Lp/f;->g:I

    iget-object v6, v8, Lp/m;->i:Lp/f;

    iget v6, v6, Lp/f;->f:I

    add-int/2addr v6, v5

    iget-object v7, v8, Lp/m;->b:Lo/e;

    .line 16
    iget v7, v7, Lo/e;->U:F

    if-ne v0, v1, :cond_25

    move v7, v11

    goto :goto_10

    :cond_25
    move v2, v4

    move v5, v6

    :goto_10
    sub-int/2addr v5, v2

    .line 17
    iget-object v0, v8, Lp/m;->e:Lp/g;

    iget v0, v0, Lp/f;->g:I

    sub-int/2addr v5, v0

    int-to-float v0, v2

    add-float/2addr v0, v11

    int-to-float v1, v5

    mul-float/2addr v1, v7

    add-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {v3, v0}, Lp/f;->c(I)V

    iget-object v0, v8, Lp/m;->i:Lp/f;

    iget-object v1, v8, Lp/m;->h:Lp/f;

    iget v1, v1, Lp/f;->g:I

    iget-object v2, v8, Lp/m;->e:Lp/g;

    iget v2, v2, Lp/f;->g:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lp/f;->c(I)V

    :cond_26
    :goto_11
    return-void

    :cond_27
    iget-object v0, v8, Lp/m;->b:Lo/e;

    iget-object v1, v0, Lo/e;->y:Lo/d;

    iget-object v0, v0, Lo/e;->A:Lo/d;

    invoke-virtual {v8, v1, v0, v10}, Lp/m;->l(Lo/d;Lo/d;I)V

    return-void
.end method

.method public d()V
    .locals 8

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-boolean v1, v0, Lo/e;->a:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lp/m;->e:Lp/g;

    invoke-virtual {v0}, Lo/e;->o()I

    move-result v0

    invoke-virtual {v1, v0}, Lp/g;->c(I)V

    :cond_0
    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-boolean v0, v0, Lp/f;->j:Z

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x3

    if-nez v0, :cond_4

    iget-object v0, p0, Lp/m;->b:Lo/e;

    invoke-virtual {v0}, Lo/e;->j()I

    move-result v0

    iput v0, p0, Lp/m;->d:I

    if-eq v0, v3, :cond_7

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lp/m;->b:Lo/e;

    .line 1
    iget-object v0, v0, Lo/e;->K:Lo/e;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lo/e;->j()I

    move-result v4

    if-eq v4, v1, :cond_2

    :cond_1
    invoke-virtual {v0}, Lo/e;->j()I

    move-result v4

    if-ne v4, v2, :cond_3

    :cond_2
    invoke-virtual {v0}, Lo/e;->o()I

    move-result v1

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->y:Lo/d;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->A:Lo/d;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lp/m;->h:Lp/f;

    iget-object v3, v0, Lo/e;->d:Lp/j;

    iget-object v3, v3, Lp/m;->h:Lp/f;

    iget-object v4, p0, Lp/m;->b:Lo/e;

    iget-object v4, v4, Lo/e;->y:Lo/d;

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, Lp/m;->b(Lp/f;Lp/f;I)V

    iget-object v2, p0, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lo/e;->d:Lp/j;

    iget-object v0, v0, Lp/m;->i:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->A:Lo/d;

    invoke-virtual {v3}, Lo/d;->b()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, Lp/m;->b(Lp/f;Lp/f;I)V

    iget-object v0, p0, Lp/m;->e:Lp/g;

    invoke-virtual {v0, v1}, Lp/g;->c(I)V

    return-void

    :cond_3
    iget v0, p0, Lp/m;->d:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v4, p0, Lp/m;->b:Lo/e;

    invoke-virtual {v4}, Lo/e;->o()I

    move-result v4

    invoke-virtual {v0, v4}, Lp/g;->c(I)V

    goto :goto_0

    :cond_4
    iget v0, p0, Lp/m;->d:I

    if-ne v0, v2, :cond_7

    iget-object v0, p0, Lp/m;->b:Lo/e;

    .line 3
    iget-object v0, v0, Lo/e;->K:Lo/e;

    if-eqz v0, :cond_5

    .line 4
    invoke-virtual {v0}, Lo/e;->j()I

    move-result v4

    if-eq v4, v1, :cond_6

    :cond_5
    invoke-virtual {v0}, Lo/e;->j()I

    move-result v4

    if-ne v4, v2, :cond_7

    :cond_6
    iget-object v1, p0, Lp/m;->h:Lp/f;

    iget-object v2, v0, Lo/e;->d:Lp/j;

    iget-object v2, v2, Lp/m;->h:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->y:Lo/d;

    invoke-virtual {v3}, Lo/d;->b()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Lp/m;->b(Lp/f;Lp/f;I)V

    iget-object v1, p0, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lo/e;->d:Lp/j;

    iget-object v0, v0, Lp/m;->i:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->A:Lo/d;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lp/m;->b(Lp/f;Lp/f;I)V

    return-void

    :cond_7
    :goto_0
    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-boolean v4, v0, Lp/f;->j:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_e

    iget-object v4, p0, Lp/m;->b:Lo/e;

    iget-boolean v6, v4, Lo/e;->a:Z

    if-eqz v6, :cond_e

    iget-object v0, v4, Lo/e;->G:[Lo/d;

    aget-object v2, v0, v5

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_b

    aget-object v2, v0, v1

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_b

    invoke-virtual {v4}, Lo/e;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    iput v2, v0, Lp/f;->f:I

    iget-object v0, p0, Lp/m;->i:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->G:[Lo/d;

    aget-object v1, v2, v1

    goto/16 :goto_7

    :cond_8
    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v2, p0, Lp/m;->h:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v3, v3, v5

    invoke-virtual {v3}, Lo/d;->b()I

    move-result v3

    .line 5
    iget-object v4, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v3, v2, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_9
    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v2, p0, Lp/m;->i:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lo/d;->b()I

    move-result v3

    neg-int v3, v3

    .line 7
    iget-object v4, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v3, v2, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_a
    iget-object v0, p0, Lp/m;->h:Lp/f;

    iput-boolean v1, v0, Lp/f;->b:Z

    iget-object v0, p0, Lp/m;->i:Lp/f;

    iput-boolean v1, v0, Lp/f;->b:Z

    goto/16 :goto_9

    :cond_b
    aget-object v2, v0, v5

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_c

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v1, p0, Lp/m;->h:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    .line 9
    iget-object v3, v1, Lp/f;->l:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v2, v1, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_c
    aget-object v2, v0, v1

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_d

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v2, p0, Lp/m;->i:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v1, v3, v1

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    neg-int v1, v1

    .line 11
    iget-object v3, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v1, v2, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-object v1, p0, Lp/m;->i:Lp/f;

    iget-object v2, p0, Lp/m;->e:Lp/g;

    iget v2, v2, Lp/f;->g:I

    neg-int v2, v2

    goto :goto_2

    :cond_d
    instance-of v0, v4, Lo/h;

    if-nez v0, :cond_1c

    .line 13
    iget-object v0, v4, Lo/e;->K:Lo/e;

    if-eqz v0, :cond_1c

    .line 14
    sget-object v0, Lo/d$a;->f:Lo/d$a;

    invoke-virtual {v4, v0}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v0

    iget-object v0, v0, Lo/d;->d:Lo/d;

    if-nez v0, :cond_1c

    iget-object v0, p0, Lp/m;->b:Lo/e;

    .line 15
    iget-object v1, v0, Lo/e;->K:Lo/e;

    .line 16
    iget-object v1, v1, Lo/e;->d:Lp/j;

    iget-object v1, v1, Lp/m;->h:Lp/f;

    iget-object v2, p0, Lp/m;->h:Lp/f;

    invoke-virtual {v0}, Lo/e;->p()I

    move-result v0

    invoke-virtual {p0, v2, v1, v0}, Lp/m;->b(Lp/f;Lp/f;I)V

    :goto_1
    iget-object v0, p0, Lp/m;->i:Lp/f;

    iget-object v1, p0, Lp/m;->h:Lp/f;

    iget-object v2, p0, Lp/m;->e:Lp/g;

    iget v2, v2, Lp/f;->g:I

    :goto_2
    invoke-virtual {p0, v0, v1, v2}, Lp/m;->b(Lp/f;Lp/f;I)V

    goto/16 :goto_9

    :cond_e
    iget v4, p0, Lp/m;->d:I

    if-ne v4, v3, :cond_15

    iget-object v4, p0, Lp/m;->b:Lo/e;

    iget v6, v4, Lo/e;->j:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_13

    if-eq v6, v3, :cond_f

    goto/16 :goto_6

    :cond_f
    iget v6, v4, Lo/e;->k:I

    if-ne v6, v3, :cond_12

    iget-object v3, p0, Lp/m;->h:Lp/f;

    iput-object p0, v3, Lp/f;->a:Lp/d;

    iget-object v3, p0, Lp/m;->i:Lp/f;

    iput-object p0, v3, Lp/f;->a:Lp/d;

    iget-object v3, v4, Lo/e;->e:Lp/l;

    iget-object v6, v3, Lp/m;->h:Lp/f;

    iput-object p0, v6, Lp/f;->a:Lp/d;

    iget-object v3, v3, Lp/m;->i:Lp/f;

    iput-object p0, v3, Lp/f;->a:Lp/d;

    iput-object p0, v0, Lp/f;->a:Lp/d;

    invoke-virtual {v4}, Lo/e;->t()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->e:Lp/l;

    iget-object v3, v3, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v3, v0, Lp/m;->e:Lp/g;

    iput-object p0, v3, Lp/f;->a:Lp/d;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    iget-object v3, v3, Lp/f;->l:Ljava/util/List;

    iget-object v0, v0, Lp/m;->h:Lp/f;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->e:Lp/l;

    iget-object v3, v3, Lp/m;->i:Lp/f;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    goto :goto_4

    :cond_10
    iget-object v0, p0, Lp/m;->b:Lo/e;

    invoke-virtual {v0}, Lo/e;->s()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->e:Lp/l;

    iget-object v3, v3, Lp/m;->e:Lp/g;

    goto/16 :goto_5

    :cond_11
    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->e:Lp/g;

    goto :goto_3

    :cond_12
    iget-object v3, v4, Lo/e;->e:Lp/l;

    iget-object v3, v3, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v3, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->i:Lp/f;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iput-boolean v1, v0, Lp/f;->b:Z

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->h:Lp/f;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->i:Lp/f;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->i:Lp/f;

    :goto_3
    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    :goto_4
    iget-object v3, p0, Lp/m;->e:Lp/g;

    goto :goto_5

    .line 17
    :cond_13
    iget-object v3, v4, Lo/e;->K:Lo/e;

    if-nez v3, :cond_14

    goto :goto_6

    .line 18
    :cond_14
    iget-object v3, v3, Lo/e;->e:Lp/l;

    iget-object v3, v3, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->l:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v3, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iput-boolean v1, v0, Lp/f;->b:Z

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->h:Lp/f;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/m;->e:Lp/g;

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    iget-object v3, p0, Lp/m;->i:Lp/f;

    :goto_5
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_6
    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v3, v0, Lo/e;->G:[Lo/d;

    aget-object v4, v3, v5

    iget-object v4, v4, Lo/d;->d:Lo/d;

    if-eqz v4, :cond_19

    aget-object v4, v3, v1

    iget-object v4, v4, Lo/d;->d:Lo/d;

    if-eqz v4, :cond_19

    invoke-virtual {v0}, Lo/e;->s()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    iput v2, v0, Lp/f;->f:I

    iget-object v0, p0, Lp/m;->i:Lp/f;

    iget-object v2, p0, Lp/m;->b:Lo/e;

    iget-object v2, v2, Lo/e;->G:[Lo/d;

    aget-object v1, v2, v1

    :goto_7
    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lp/f;->f:I

    goto/16 :goto_9

    :cond_16
    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget-object v0, v0, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v1, v3, v1

    invoke-virtual {p0, v1}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v1

    .line 19
    iget-object v3, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, v0, Lp/f;->j:Z

    if-eqz v0, :cond_17

    invoke-virtual {p0, p0}, Lp/j;->a(Lp/d;)V

    :cond_17
    iget-object v0, v1, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, v1, Lp/f;->j:Z

    if-eqz v0, :cond_18

    invoke-virtual {p0, p0}, Lp/j;->a(Lp/d;)V

    .line 20
    :cond_18
    iput v2, p0, Lp/m;->j:I

    goto/16 :goto_9

    :cond_19
    aget-object v2, v3, v5

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_1a

    aget-object v0, v3, v5

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v2, p0, Lp/m;->h:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v3, v3, v5

    invoke-virtual {v3}, Lo/d;->b()I

    move-result v3

    .line 21
    iget-object v4, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v3, v2, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 22
    :cond_1a
    aget-object v2, v3, v1

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_1b

    aget-object v0, v3, v1

    invoke-virtual {p0, v0}, Lp/m;->h(Lo/d;)Lp/f;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v2, p0, Lp/m;->i:Lp/f;

    iget-object v3, p0, Lp/m;->b:Lo/e;

    iget-object v3, v3, Lo/e;->G:[Lo/d;

    aget-object v1, v3, v1

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    neg-int v1, v1

    .line 23
    iget-object v3, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v1, v2, Lp/f;->f:I

    iget-object v0, v0, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-object v1, p0, Lp/m;->i:Lp/f;

    const/4 v2, -0x1

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-virtual {p0, v0, v1, v2, v3}, Lp/m;->c(Lp/f;Lp/f;ILp/g;)V

    goto :goto_9

    :cond_1b
    instance-of v2, v0, Lo/h;

    if-nez v2, :cond_1c

    .line 25
    iget-object v2, v0, Lo/e;->K:Lo/e;

    if-eqz v2, :cond_1c

    .line 26
    iget-object v2, v2, Lo/e;->d:Lp/j;

    iget-object v2, v2, Lp/m;->h:Lp/f;

    iget-object v3, p0, Lp/m;->h:Lp/f;

    invoke-virtual {v0}, Lo/e;->p()I

    move-result v0

    invoke-virtual {p0, v3, v2, v0}, Lp/m;->b(Lp/f;Lp/f;I)V

    :goto_8
    iget-object v0, p0, Lp/m;->i:Lp/f;

    iget-object v2, p0, Lp/m;->h:Lp/f;

    iget-object v3, p0, Lp/m;->e:Lp/g;

    invoke-virtual {p0, v0, v2, v1, v3}, Lp/m;->c(Lp/f;Lp/f;ILp/g;)V

    :cond_1c
    :goto_9
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lp/m;->h:Lp/f;

    iget-boolean v1, v0, Lp/f;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lp/m;->b:Lo/e;

    iget v0, v0, Lp/f;->g:I

    .line 1
    iput v0, v1, Lo/e;->P:I

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lp/m;->c:Lp/k;

    iget-object v0, p0, Lp/m;->h:Lp/f;

    invoke-virtual {v0}, Lp/f;->b()V

    iget-object v0, p0, Lp/m;->i:Lp/f;

    invoke-virtual {v0}, Lp/f;->b()V

    iget-object v0, p0, Lp/m;->e:Lp/g;

    invoke-virtual {v0}, Lp/f;->b()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp/m;->g:Z

    return-void
.end method

.method public k()Z
    .locals 3

    iget v0, p0, Lp/m;->d:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lp/m;->b:Lo/e;

    iget v0, v0, Lo/e;->j:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final m([IIIIIFI)V
    .locals 2

    sub-int/2addr p3, p2

    sub-int/2addr p5, p4

    const/4 p2, -0x1

    const/4 p4, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    if-eq p7, p2, :cond_2

    if-eqz p7, :cond_1

    if-eq p7, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p2, p3

    mul-float/2addr p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    aput p3, p1, p4

    aput p2, p1, v1

    goto :goto_0

    :cond_1
    int-to-float p2, p5

    mul-float/2addr p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    aput p2, p1, p4

    aput p5, p1, v1

    goto :goto_0

    :cond_2
    int-to-float p2, p5

    mul-float/2addr p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    int-to-float p7, p3

    div-float/2addr p7, p6

    add-float/2addr p7, v0

    float-to-int p6, p7

    if-gt p2, p3, :cond_3

    aput p2, p1, p4

    aput p5, p1, v1

    goto :goto_0

    :cond_3
    if-gt p6, p5, :cond_4

    aput p3, p1, p4

    aput p6, p1, v1

    :cond_4
    :goto_0
    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp/m;->g:Z

    iget-object v1, p0, Lp/m;->h:Lp/f;

    invoke-virtual {v1}, Lp/f;->b()V

    iget-object v1, p0, Lp/m;->h:Lp/f;

    iput-boolean v0, v1, Lp/f;->j:Z

    iget-object v1, p0, Lp/m;->i:Lp/f;

    invoke-virtual {v1}, Lp/f;->b()V

    iget-object v1, p0, Lp/m;->i:Lp/f;

    iput-boolean v0, v1, Lp/f;->j:Z

    iget-object v1, p0, Lp/m;->e:Lp/g;

    iput-boolean v0, v1, Lp/f;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const-string v0, "HorizontalRun "

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lp/m;->b:Lo/e;

    .line 1
    iget-object v1, v1, Lo/e;->Y:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
