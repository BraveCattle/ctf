.class public Lp/c;
.super Lp/m;
.source ""


# instance fields
.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp/m;",
            ">;"
        }
    .end annotation
.end field

.field public l:I


# direct methods
.method public constructor <init>(Lo/e;I)V
    .locals 3

    invoke-direct {p0, p1}, Lp/m;-><init>(Lo/e;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lp/c;->k:Ljava/util/ArrayList;

    iput p2, p0, Lp/m;->f:I

    .line 1
    iget-object p1, p0, Lp/m;->b:Lo/e;

    :goto_0
    iget p2, p0, Lp/m;->f:I

    invoke-virtual {p1, p2}, Lo/e;->l(I)Lo/e;

    move-result-object p2

    if-eqz p2, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lp/m;->b:Lo/e;

    iget-object p2, p0, Lp/c;->k:Ljava/util/ArrayList;

    iget v0, p0, Lp/m;->f:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    move-object v0, p0

    goto :goto_2

    :cond_1
    if-ne v0, v1, :cond_2

    move-object v0, p0

    goto :goto_3

    :cond_2
    move-object v0, p0

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p2, v0, Lp/m;->f:I

    invoke-virtual {p1, p2}, Lo/e;->k(I)Lo/e;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p2, v0, Lp/c;->k:Ljava/util/ArrayList;

    iget v2, v0, Lp/m;->f:I

    if-nez v2, :cond_4

    .line 2
    :goto_2
    iget-object v2, p1, Lo/e;->d:Lp/j;

    goto :goto_1

    :cond_4
    if-ne v2, v1, :cond_3

    :goto_3
    iget-object v2, p1, Lo/e;->e:Lp/l;

    goto :goto_1

    .line 3
    :cond_5
    iget-object p1, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp/m;

    iget v2, v0, Lp/m;->f:I

    if-nez v2, :cond_7

    iget-object p2, p2, Lp/m;->b:Lo/e;

    iput-object v0, p2, Lo/e;->b:Lp/c;

    goto :goto_4

    :cond_7
    if-ne v2, v1, :cond_6

    iget-object p2, p2, Lp/m;->b:Lo/e;

    iput-object v0, p2, Lo/e;->c:Lp/c;

    goto :goto_4

    :cond_8
    iget p1, v0, Lp/m;->f:I

    if-nez p1, :cond_9

    iget-object p1, v0, Lp/m;->b:Lo/e;

    .line 4
    iget-object p1, p1, Lo/e;->K:Lo/e;

    .line 5
    check-cast p1, Lo/f;

    .line 6
    iget-boolean p1, p1, Lo/f;->i0:Z

    if-eqz p1, :cond_9

    move p1, v1

    goto :goto_5

    :cond_9
    const/4 p1, 0x0

    :goto_5
    if-eqz p1, :cond_a

    .line 7
    iget-object p1, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-le p1, v1, :cond_a

    iget-object p1, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp/m;

    iget-object p1, p1, Lp/m;->b:Lo/e;

    iput-object p1, v0, Lp/m;->b:Lo/e;

    :cond_a
    iget p1, v0, Lp/m;->f:I

    if-nez p1, :cond_b

    iget-object p1, v0, Lp/m;->b:Lo/e;

    .line 8
    iget p1, p1, Lo/e;->Z:I

    goto :goto_6

    .line 9
    :cond_b
    iget-object p1, v0, Lp/m;->b:Lo/e;

    .line 10
    iget p1, p1, Lo/e;->a0:I

    .line 11
    :goto_6
    iput p1, v0, Lp/c;->l:I

    return-void
.end method


# virtual methods
.method public a(Lp/d;)V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lp/m;->h:Lp/f;

    iget-boolean v2, v1, Lp/f;->j:Z

    if-eqz v2, :cond_58

    iget-object v2, v0, Lp/m;->i:Lp/f;

    iget-boolean v3, v2, Lp/f;->j:Z

    if-nez v3, :cond_0

    goto/16 :goto_34

    :cond_0
    iget-object v3, v0, Lp/m;->b:Lo/e;

    .line 1
    iget-object v3, v3, Lo/e;->K:Lo/e;

    if-eqz v3, :cond_1

    .line 2
    instance-of v5, v3, Lo/f;

    if-eqz v5, :cond_1

    check-cast v3, Lo/f;

    .line 3
    iget-boolean v3, v3, Lo/f;->i0:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 4
    :goto_0
    iget v2, v2, Lp/f;->g:I

    iget v1, v1, Lp/f;->g:I

    sub-int/2addr v2, v1

    iget-object v1, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v5, 0x0

    :goto_1
    const/4 v6, -0x1

    const/16 v7, 0x8

    if-ge v5, v1, :cond_2

    iget-object v8, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp/m;

    iget-object v8, v8, Lp/m;->b:Lo/e;

    .line 5
    iget v8, v8, Lo/e;->X:I

    if-ne v8, v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move v5, v6

    :cond_3
    add-int/lit8 v8, v1, -0x1

    move v9, v8

    :goto_2
    if-ltz v9, :cond_5

    .line 6
    iget-object v10, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp/m;

    iget-object v10, v10, Lp/m;->b:Lo/e;

    .line 7
    iget v10, v10, Lo/e;->X:I

    if-ne v10, v7, :cond_4

    add-int/lit8 v9, v9, -0x1

    goto :goto_2

    :cond_4
    move v6, v9

    :cond_5
    const/4 v9, 0x0

    :goto_3
    const/4 v11, 0x2

    const/4 v13, 0x3

    if-ge v9, v11, :cond_14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_4
    if-ge v14, v1, :cond_11

    .line 8
    iget-object v4, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp/m;

    iget-object v11, v4, Lp/m;->b:Lo/e;

    .line 9
    iget v10, v11, Lo/e;->X:I

    if-ne v10, v7, :cond_6

    goto/16 :goto_a

    :cond_6
    add-int/lit8 v17, v17, 0x1

    if-lez v14, :cond_7

    if-lt v14, v5, :cond_7

    .line 10
    iget-object v10, v4, Lp/m;->h:Lp/f;

    iget v10, v10, Lp/f;->f:I

    add-int/2addr v15, v10

    :cond_7
    iget-object v10, v4, Lp/m;->e:Lp/g;

    iget v7, v10, Lp/f;->g:I

    iget v12, v4, Lp/m;->d:I

    if-eq v12, v13, :cond_8

    const/4 v12, 0x1

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    :goto_5
    if-eqz v12, :cond_b

    iget v10, v0, Lp/m;->f:I

    if-nez v10, :cond_9

    iget-object v13, v11, Lo/e;->d:Lp/j;

    iget-object v13, v13, Lp/m;->e:Lp/g;

    iget-boolean v13, v13, Lp/f;->j:Z

    if-nez v13, :cond_9

    return-void

    :cond_9
    const/4 v13, 0x1

    if-ne v10, v13, :cond_a

    iget-object v10, v11, Lo/e;->e:Lp/l;

    iget-object v10, v10, Lp/m;->e:Lp/g;

    iget-boolean v10, v10, Lp/f;->j:Z

    if-nez v10, :cond_a

    return-void

    :cond_a
    move/from16 v20, v7

    goto :goto_7

    :cond_b
    move/from16 v20, v7

    const/4 v13, 0x1

    iget v7, v4, Lp/m;->a:I

    if-ne v7, v13, :cond_c

    if-nez v9, :cond_c

    iget v7, v10, Lp/g;->m:I

    add-int/lit8 v16, v16, 0x1

    goto :goto_6

    :cond_c
    iget-boolean v7, v10, Lp/f;->j:Z

    if-eqz v7, :cond_d

    move/from16 v7, v20

    :goto_6
    const/4 v12, 0x1

    goto :goto_8

    :cond_d
    :goto_7
    move/from16 v7, v20

    :goto_8
    if-nez v12, :cond_e

    add-int/lit8 v16, v16, 0x1

    iget-object v7, v11, Lo/e;->b0:[F

    iget v10, v0, Lp/m;->f:I

    aget v7, v7, v10

    const/4 v10, 0x0

    cmpl-float v11, v7, v10

    if-ltz v11, :cond_f

    add-float v18, v18, v7

    goto :goto_9

    :cond_e
    add-int/2addr v15, v7

    :cond_f
    :goto_9
    if-ge v14, v8, :cond_10

    if-ge v14, v6, :cond_10

    iget-object v4, v4, Lp/m;->i:Lp/f;

    iget v4, v4, Lp/f;->f:I

    neg-int v4, v4

    add-int/2addr v15, v4

    :cond_10
    :goto_a
    add-int/lit8 v14, v14, 0x1

    const/16 v7, 0x8

    const/4 v11, 0x2

    const/4 v13, 0x3

    goto/16 :goto_4

    :cond_11
    if-lt v15, v2, :cond_13

    if-nez v16, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v9, v9, 0x1

    const/16 v7, 0x8

    goto/16 :goto_3

    :cond_13
    :goto_b
    move/from16 v4, v16

    move/from16 v7, v17

    goto :goto_c

    :cond_14
    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    :goto_c
    iget-object v9, v0, Lp/m;->h:Lp/f;

    iget v9, v9, Lp/f;->g:I

    if-eqz v3, :cond_15

    iget-object v9, v0, Lp/m;->i:Lp/f;

    iget v9, v9, Lp/f;->g:I

    :cond_15
    const/high16 v10, 0x3f000000    # 0.5f

    if-le v15, v2, :cond_17

    const/high16 v11, 0x40000000    # 2.0f

    sub-int v12, v15, v2

    int-to-float v12, v12

    div-float/2addr v12, v11

    add-float/2addr v12, v10

    float-to-int v11, v12

    if-eqz v3, :cond_16

    add-int/2addr v9, v11

    goto :goto_d

    :cond_16
    sub-int/2addr v9, v11

    :cond_17
    :goto_d
    if-lez v4, :cond_28

    sub-int v11, v2, v15

    int-to-float v11, v11

    int-to-float v12, v4

    div-float v12, v11, v12

    add-float/2addr v12, v10

    float-to-int v12, v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_e
    if-ge v13, v1, :cond_21

    iget-object v10, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp/m;

    move/from16 v17, v12

    iget-object v12, v10, Lp/m;->b:Lo/e;

    move/from16 v20, v15

    .line 11
    iget v15, v12, Lo/e;->X:I

    move/from16 v21, v9

    const/16 v9, 0x8

    if-ne v15, v9, :cond_18

    goto/16 :goto_13

    .line 12
    :cond_18
    iget v9, v10, Lp/m;->d:I

    const/4 v15, 0x3

    if-ne v9, v15, :cond_20

    iget-object v9, v10, Lp/m;->e:Lp/g;

    iget-boolean v15, v9, Lp/f;->j:Z

    if-nez v15, :cond_20

    const/4 v15, 0x0

    cmpl-float v19, v18, v15

    if-lez v19, :cond_19

    iget-object v15, v12, Lo/e;->b0:[F

    move/from16 v22, v3

    iget v3, v0, Lp/m;->f:I

    aget v3, v15, v3

    mul-float/2addr v3, v11

    div-float v3, v3, v18

    const/high16 v15, 0x3f000000    # 0.5f

    add-float/2addr v3, v15

    float-to-int v3, v3

    goto :goto_f

    :cond_19
    move/from16 v22, v3

    move/from16 v3, v17

    :goto_f
    iget v15, v0, Lp/m;->f:I

    if-nez v15, :cond_1c

    iget v15, v12, Lo/e;->n:I

    iget v12, v12, Lo/e;->m:I

    move/from16 v23, v11

    iget v11, v10, Lp/m;->a:I

    move/from16 v24, v7

    const/4 v7, 0x1

    if-ne v11, v7, :cond_1a

    iget v7, v9, Lp/g;->m:I

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    goto :goto_10

    :cond_1a
    move v7, v3

    :goto_10
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    if-lez v15, :cond_1b

    invoke-static {v15, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_1b
    if-eq v7, v3, :cond_1f

    add-int/lit8 v14, v14, 0x1

    move v3, v7

    goto :goto_12

    :cond_1c
    move/from16 v24, v7

    move/from16 v23, v11

    iget v7, v12, Lo/e;->q:I

    iget v11, v12, Lo/e;->p:I

    iget v12, v10, Lp/m;->a:I

    const/4 v15, 0x1

    if-ne v12, v15, :cond_1d

    iget v9, v9, Lp/g;->m:I

    invoke-static {v3, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    goto :goto_11

    :cond_1d
    move v9, v3

    :goto_11
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    if-lez v7, :cond_1e

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    :cond_1e
    if-eq v9, v3, :cond_1f

    add-int/lit8 v14, v14, 0x1

    move v3, v9

    :cond_1f
    :goto_12
    iget-object v7, v10, Lp/m;->e:Lp/g;

    invoke-virtual {v7, v3}, Lp/g;->c(I)V

    goto :goto_14

    :cond_20
    :goto_13
    move/from16 v22, v3

    move/from16 v24, v7

    move/from16 v23, v11

    :goto_14
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v17

    move/from16 v15, v20

    move/from16 v9, v21

    move/from16 v3, v22

    move/from16 v11, v23

    move/from16 v7, v24

    const/high16 v10, 0x3f000000    # 0.5f

    goto/16 :goto_e

    :cond_21
    move/from16 v22, v3

    move/from16 v24, v7

    move/from16 v21, v9

    move/from16 v20, v15

    if-lez v14, :cond_26

    sub-int/2addr v4, v14

    const/4 v3, 0x0

    const/4 v7, 0x0

    :goto_15
    if-ge v3, v1, :cond_25

    iget-object v9, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp/m;

    iget-object v10, v9, Lp/m;->b:Lo/e;

    .line 13
    iget v10, v10, Lo/e;->X:I

    const/16 v11, 0x8

    if-ne v10, v11, :cond_22

    goto :goto_16

    :cond_22
    if-lez v3, :cond_23

    if-lt v3, v5, :cond_23

    .line 14
    iget-object v10, v9, Lp/m;->h:Lp/f;

    iget v10, v10, Lp/f;->f:I

    add-int/2addr v7, v10

    :cond_23
    iget-object v10, v9, Lp/m;->e:Lp/g;

    iget v10, v10, Lp/f;->g:I

    add-int/2addr v7, v10

    if-ge v3, v8, :cond_24

    if-ge v3, v6, :cond_24

    iget-object v9, v9, Lp/m;->i:Lp/f;

    iget v9, v9, Lp/f;->f:I

    neg-int v9, v9

    add-int/2addr v7, v9

    :cond_24
    :goto_16
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_25
    move v15, v7

    goto :goto_17

    :cond_26
    move/from16 v15, v20

    :goto_17
    iget v3, v0, Lp/c;->l:I

    const/4 v7, 0x2

    if-ne v3, v7, :cond_27

    if-nez v14, :cond_27

    const/4 v3, 0x0

    iput v3, v0, Lp/c;->l:I

    goto :goto_18

    :cond_27
    const/4 v3, 0x0

    goto :goto_18

    :cond_28
    move/from16 v22, v3

    move/from16 v24, v7

    move/from16 v21, v9

    move/from16 v20, v15

    const/4 v3, 0x0

    const/4 v7, 0x2

    :goto_18
    if-le v15, v2, :cond_29

    iput v7, v0, Lp/c;->l:I

    :cond_29
    if-lez v24, :cond_2a

    if-nez v4, :cond_2a

    if-ne v5, v6, :cond_2a

    iput v7, v0, Lp/c;->l:I

    :cond_2a
    iget v7, v0, Lp/c;->l:I

    const/4 v9, 0x1

    move/from16 v10, v24

    if-ne v7, v9, :cond_3a

    if-le v10, v9, :cond_2b

    sub-int/2addr v2, v15

    add-int/lit8 v7, v10, -0x1

    div-int/2addr v2, v7

    goto :goto_19

    :cond_2b
    if-ne v10, v9, :cond_2c

    sub-int/2addr v2, v15

    const/4 v7, 0x2

    div-int/2addr v2, v7

    goto :goto_19

    :cond_2c
    move v2, v3

    :goto_19
    if-lez v4, :cond_2d

    move v2, v3

    :cond_2d
    move v4, v3

    move/from16 v9, v21

    :goto_1a
    if-ge v4, v1, :cond_58

    if-eqz v22, :cond_2e

    add-int/lit8 v3, v4, 0x1

    sub-int v3, v1, v3

    goto :goto_1b

    :cond_2e
    move v3, v4

    :goto_1b
    iget-object v7, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/m;

    iget-object v7, v3, Lp/m;->b:Lo/e;

    .line 15
    iget v7, v7, Lo/e;->X:I

    const/16 v10, 0x8

    if-ne v7, v10, :cond_2f

    .line 16
    iget-object v7, v3, Lp/m;->h:Lp/f;

    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    iget-object v3, v3, Lp/m;->i:Lp/f;

    invoke-virtual {v3, v9}, Lp/f;->c(I)V

    goto :goto_21

    :cond_2f
    if-lez v4, :cond_31

    if-eqz v22, :cond_30

    sub-int/2addr v9, v2

    goto :goto_1c

    :cond_30
    add-int/2addr v9, v2

    :cond_31
    :goto_1c
    if-lez v4, :cond_33

    if-lt v4, v5, :cond_33

    iget-object v7, v3, Lp/m;->h:Lp/f;

    iget v7, v7, Lp/f;->f:I

    if-eqz v22, :cond_32

    sub-int/2addr v9, v7

    goto :goto_1d

    :cond_32
    add-int/2addr v9, v7

    :cond_33
    :goto_1d
    if-eqz v22, :cond_34

    iget-object v7, v3, Lp/m;->i:Lp/f;

    goto :goto_1e

    :cond_34
    iget-object v7, v3, Lp/m;->h:Lp/f;

    :goto_1e
    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    iget-object v7, v3, Lp/m;->e:Lp/g;

    iget v10, v7, Lp/f;->g:I

    iget v11, v3, Lp/m;->d:I

    const/4 v12, 0x3

    if-ne v11, v12, :cond_35

    iget v11, v3, Lp/m;->a:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_35

    iget v10, v7, Lp/g;->m:I

    :cond_35
    if-eqz v22, :cond_36

    sub-int/2addr v9, v10

    goto :goto_1f

    :cond_36
    add-int/2addr v9, v10

    :goto_1f
    if-eqz v22, :cond_37

    iget-object v7, v3, Lp/m;->h:Lp/f;

    goto :goto_20

    :cond_37
    iget-object v7, v3, Lp/m;->i:Lp/f;

    :goto_20
    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    const/4 v7, 0x1

    iput-boolean v7, v3, Lp/m;->g:Z

    if-ge v4, v8, :cond_39

    if-ge v4, v6, :cond_39

    iget-object v3, v3, Lp/m;->i:Lp/f;

    iget v3, v3, Lp/f;->f:I

    neg-int v3, v3

    if-eqz v22, :cond_38

    sub-int/2addr v9, v3

    goto :goto_21

    :cond_38
    add-int/2addr v9, v3

    :cond_39
    :goto_21
    add-int/lit8 v4, v4, 0x1

    goto :goto_1a

    :cond_3a
    if-nez v7, :cond_47

    sub-int/2addr v2, v15

    const/4 v7, 0x1

    add-int/lit8 v9, v10, 0x1

    div-int/2addr v2, v9

    if-lez v4, :cond_3b

    move v2, v3

    :cond_3b
    move v4, v3

    move/from16 v9, v21

    :goto_22
    if-ge v4, v1, :cond_58

    if-eqz v22, :cond_3c

    add-int/lit8 v3, v4, 0x1

    sub-int v3, v1, v3

    goto :goto_23

    :cond_3c
    move v3, v4

    :goto_23
    iget-object v7, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/m;

    iget-object v7, v3, Lp/m;->b:Lo/e;

    .line 17
    iget v7, v7, Lo/e;->X:I

    const/16 v10, 0x8

    if-ne v7, v10, :cond_3d

    .line 18
    iget-object v7, v3, Lp/m;->h:Lp/f;

    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    iget-object v3, v3, Lp/m;->i:Lp/f;

    invoke-virtual {v3, v9}, Lp/f;->c(I)V

    goto :goto_29

    :cond_3d
    if-eqz v22, :cond_3e

    sub-int/2addr v9, v2

    goto :goto_24

    :cond_3e
    add-int/2addr v9, v2

    :goto_24
    if-lez v4, :cond_40

    if-lt v4, v5, :cond_40

    iget-object v7, v3, Lp/m;->h:Lp/f;

    iget v7, v7, Lp/f;->f:I

    if-eqz v22, :cond_3f

    sub-int/2addr v9, v7

    goto :goto_25

    :cond_3f
    add-int/2addr v9, v7

    :cond_40
    :goto_25
    if-eqz v22, :cond_41

    iget-object v7, v3, Lp/m;->i:Lp/f;

    goto :goto_26

    :cond_41
    iget-object v7, v3, Lp/m;->h:Lp/f;

    :goto_26
    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    iget-object v7, v3, Lp/m;->e:Lp/g;

    iget v10, v7, Lp/f;->g:I

    iget v11, v3, Lp/m;->d:I

    const/4 v12, 0x3

    if-ne v11, v12, :cond_42

    iget v11, v3, Lp/m;->a:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_42

    iget v7, v7, Lp/g;->m:I

    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    move-result v10

    :cond_42
    if-eqz v22, :cond_43

    sub-int/2addr v9, v10

    goto :goto_27

    :cond_43
    add-int/2addr v9, v10

    :goto_27
    if-eqz v22, :cond_44

    iget-object v7, v3, Lp/m;->h:Lp/f;

    goto :goto_28

    :cond_44
    iget-object v7, v3, Lp/m;->i:Lp/f;

    :goto_28
    invoke-virtual {v7, v9}, Lp/f;->c(I)V

    if-ge v4, v8, :cond_46

    if-ge v4, v6, :cond_46

    iget-object v3, v3, Lp/m;->i:Lp/f;

    iget v3, v3, Lp/f;->f:I

    neg-int v3, v3

    if-eqz v22, :cond_45

    sub-int/2addr v9, v3

    goto :goto_29

    :cond_45
    add-int/2addr v9, v3

    :cond_46
    :goto_29
    add-int/lit8 v4, v4, 0x1

    goto :goto_22

    :cond_47
    const/4 v9, 0x2

    if-ne v7, v9, :cond_58

    iget v7, v0, Lp/m;->f:I

    if-nez v7, :cond_48

    iget-object v7, v0, Lp/m;->b:Lo/e;

    .line 19
    iget v7, v7, Lo/e;->U:F

    goto :goto_2a

    .line 20
    :cond_48
    iget-object v7, v0, Lp/m;->b:Lo/e;

    .line 21
    iget v7, v7, Lo/e;->V:F

    :goto_2a
    if-eqz v22, :cond_49

    const/high16 v9, 0x3f800000    # 1.0f

    sub-float v7, v9, v7

    :cond_49
    sub-int/2addr v2, v15

    int-to-float v2, v2

    mul-float/2addr v2, v7

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v2, v7

    float-to-int v2, v2

    if-ltz v2, :cond_4a

    if-lez v4, :cond_4b

    :cond_4a
    move v2, v3

    :cond_4b
    if-eqz v22, :cond_4c

    sub-int v9, v21, v2

    goto :goto_2b

    :cond_4c
    add-int v9, v21, v2

    :goto_2b
    move v4, v3

    :goto_2c
    if-ge v4, v1, :cond_58

    if-eqz v22, :cond_4d

    add-int/lit8 v2, v4, 0x1

    sub-int v2, v1, v2

    goto :goto_2d

    :cond_4d
    move v2, v4

    .line 22
    :goto_2d
    iget-object v3, v0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/m;

    iget-object v3, v2, Lp/m;->b:Lo/e;

    .line 23
    iget v3, v3, Lo/e;->X:I

    const/16 v7, 0x8

    if-ne v3, v7, :cond_4e

    .line 24
    iget-object v3, v2, Lp/m;->h:Lp/f;

    invoke-virtual {v3, v9}, Lp/f;->c(I)V

    iget-object v2, v2, Lp/m;->i:Lp/f;

    invoke-virtual {v2, v9}, Lp/f;->c(I)V

    const/4 v12, 0x3

    const/4 v13, 0x1

    goto :goto_33

    :cond_4e
    if-lez v4, :cond_50

    if-lt v4, v5, :cond_50

    iget-object v3, v2, Lp/m;->h:Lp/f;

    iget v3, v3, Lp/f;->f:I

    if-eqz v22, :cond_4f

    sub-int/2addr v9, v3

    goto :goto_2e

    :cond_4f
    add-int/2addr v9, v3

    :cond_50
    :goto_2e
    if-eqz v22, :cond_51

    iget-object v3, v2, Lp/m;->i:Lp/f;

    goto :goto_2f

    :cond_51
    iget-object v3, v2, Lp/m;->h:Lp/f;

    :goto_2f
    invoke-virtual {v3, v9}, Lp/f;->c(I)V

    iget-object v3, v2, Lp/m;->e:Lp/g;

    iget v10, v3, Lp/f;->g:I

    iget v11, v2, Lp/m;->d:I

    const/4 v12, 0x3

    if-ne v11, v12, :cond_52

    iget v11, v2, Lp/m;->a:I

    const/4 v13, 0x1

    if-ne v11, v13, :cond_53

    iget v10, v3, Lp/g;->m:I

    goto :goto_30

    :cond_52
    const/4 v13, 0x1

    :cond_53
    :goto_30
    if-eqz v22, :cond_54

    sub-int/2addr v9, v10

    goto :goto_31

    :cond_54
    add-int/2addr v9, v10

    :goto_31
    if-eqz v22, :cond_55

    iget-object v3, v2, Lp/m;->h:Lp/f;

    goto :goto_32

    :cond_55
    iget-object v3, v2, Lp/m;->i:Lp/f;

    :goto_32
    invoke-virtual {v3, v9}, Lp/f;->c(I)V

    if-ge v4, v8, :cond_57

    if-ge v4, v6, :cond_57

    iget-object v2, v2, Lp/m;->i:Lp/f;

    iget v2, v2, Lp/f;->f:I

    neg-int v2, v2

    if-eqz v22, :cond_56

    sub-int/2addr v9, v2

    goto :goto_33

    :cond_56
    add-int/2addr v9, v2

    :cond_57
    :goto_33
    add-int/lit8 v4, v4, 0x1

    goto :goto_2c

    :cond_58
    :goto_34
    return-void
.end method

.method public d()V
    .locals 6

    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/m;

    invoke-virtual {v1}, Lp/m;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Lp/c;->k:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/m;

    iget-object v2, v2, Lp/m;->b:Lo/e;

    iget-object v4, p0, Lp/c;->k:Ljava/util/ArrayList;

    sub-int/2addr v0, v1

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/m;

    iget-object v0, v0, Lp/m;->b:Lo/e;

    iget v4, p0, Lp/m;->f:I

    if-nez v4, :cond_5

    iget-object v1, v2, Lo/e;->y:Lo/d;

    iget-object v0, v0, Lo/e;->A:Lo/d;

    invoke-virtual {p0, v1, v3}, Lp/m;->i(Lo/d;I)Lp/f;

    move-result-object v2

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    invoke-virtual {p0}, Lp/c;->m()Lo/e;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v1, v4, Lo/e;->y:Lo/d;

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    :cond_2
    if-eqz v2, :cond_3

    iget-object v4, p0, Lp/m;->h:Lp/f;

    .line 1
    iget-object v5, v4, Lp/f;->l:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v1, v4, Lp/f;->f:I

    iget-object v1, v2, Lp/f;->k:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    :cond_3
    invoke-virtual {p0, v0, v3}, Lp/m;->i(Lo/d;I)Lp/f;

    move-result-object v1

    invoke-virtual {v0}, Lo/d;->b()I

    move-result v0

    invoke-virtual {p0}, Lp/c;->n()Lo/e;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v0, v2, Lo/e;->A:Lo/d;

    invoke-virtual {v0}, Lo/d;->b()I

    move-result v0

    :cond_4
    if-eqz v1, :cond_9

    :goto_1
    iget-object v2, p0, Lp/m;->i:Lp/f;

    neg-int v0, v0

    .line 3
    iget-object v3, v2, Lp/f;->l:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v0, v2, Lp/f;->f:I

    iget-object v0, v1, Lp/f;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 4
    :cond_5
    iget-object v2, v2, Lo/e;->z:Lo/d;

    iget-object v0, v0, Lo/e;->B:Lo/d;

    invoke-virtual {p0, v2, v1}, Lp/m;->i(Lo/d;I)Lp/f;

    move-result-object v3

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    invoke-virtual {p0}, Lp/c;->m()Lo/e;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v2, v4, Lo/e;->z:Lo/d;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    :cond_6
    if-eqz v3, :cond_7

    iget-object v4, p0, Lp/m;->h:Lp/f;

    .line 5
    iget-object v5, v4, Lp/f;->l:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v2, v4, Lp/f;->f:I

    iget-object v2, v3, Lp/f;->k:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_7
    invoke-virtual {p0, v0, v1}, Lp/m;->i(Lo/d;I)Lp/f;

    move-result-object v1

    invoke-virtual {v0}, Lo/d;->b()I

    move-result v0

    invoke-virtual {p0}, Lp/c;->n()Lo/e;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v0, v2, Lo/e;->B:Lo/d;

    invoke-virtual {v0}, Lo/d;->b()I

    move-result v0

    :cond_8
    if-eqz v1, :cond_9

    goto :goto_1

    :cond_9
    :goto_2
    iget-object v0, p0, Lp/m;->h:Lp/f;

    iput-object p0, v0, Lp/f;->a:Lp/d;

    iget-object v0, p0, Lp/m;->i:Lp/f;

    iput-object p0, v0, Lp/f;->a:Lp/d;

    return-void
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/m;

    invoke-virtual {v1}, Lp/m;->e()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lp/m;->c:Lp/k;

    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/m;

    invoke-virtual {v1}, Lp/m;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()J
    .locals 7

    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp/m;

    iget-object v5, v4, Lp/m;->h:Lp/f;

    iget v5, v5, Lp/f;->f:I

    int-to-long v5, v5

    add-long/2addr v1, v5

    invoke-virtual {v4}, Lp/m;->j()J

    move-result-wide v5

    add-long/2addr v5, v1

    iget-object v1, v4, Lp/m;->i:Lp/f;

    iget v1, v1, Lp/f;->f:I

    int-to-long v1, v1

    add-long/2addr v1, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public k()Z
    .locals 4

    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/m;

    invoke-virtual {v3}, Lp/m;->k()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final m()Lo/e;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/m;

    iget-object v1, v1, Lp/m;->b:Lo/e;

    .line 1
    iget v2, v1, Lo/e;->X:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n()Lo/e;
    .locals 4

    iget-object v0, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/m;

    iget-object v1, v1, Lp/m;->b:Lo/e;

    .line 1
    iget v2, v1, Lo/e;->X:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "ChainRun "

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lp/m;->f:I

    if-nez v1, :cond_0

    const-string v1, "horizontal : "

    goto :goto_0

    :cond_0
    const-string v1, "vertical : "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/m;

    const-string v3, "<"

    invoke-static {v0, v3}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "> "

    invoke-static {v0, v2}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    return-object v0
.end method
