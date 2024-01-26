.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$a;,
        Landroidx/constraintlayout/widget/ConstraintLayout$b;
    }
.end annotation


# instance fields
.field public b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/widget/b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lo/f;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:Landroidx/constraintlayout/widget/c;

.field public l:Lq/b;

.field public m:I

.field public n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public o:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lo/e;",
            ">;"
        }
    .end annotation
.end field

.field public p:Landroidx/constraintlayout/widget/ConstraintLayout$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Lo/f;

    invoke-direct {p1}, Lo/f;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/16 v0, 0x107

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lq/b;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {v1, p0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 1
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 2
    iput-object p0, v2, Lo/e;->W:Ljava/lang/Object;

    .line 3
    iput-object v1, v2, Lo/f;->h0:Lp/b$b;

    iget-object v2, v2, Lo/f;->g0:Lp/e;

    .line 4
    iput-object v1, v2, Lp/e;->f:Lp/b$b;

    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lq/e;->b:[I

    invoke-virtual {v1, p2, v2, p1, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_7

    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/16 v4, 0x9

    if-ne v3, v4, :cond_0

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_0
    const/16 v4, 0xa

    if-ne v3, v4, :cond_1

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_1
    const/4 v4, 0x7

    if-ne v3, v4, :cond_2

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_2
    const/16 v4, 0x8

    if-ne v3, v4, :cond_3

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    goto :goto_2

    :cond_3
    const/16 v4, 0x59

    if-ne v3, v4, :cond_4

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    goto :goto_2

    :cond_4
    const/16 v4, 0x26

    if-ne v3, v4, :cond_5

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_6

    .line 6
    :try_start_0
    new-instance v4, Lq/b;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5, p0, v3}, Lq/b;-><init>(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;I)V

    iput-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lq/b;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 7
    :catch_0
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lq/b;

    goto :goto_2

    :cond_5
    const/16 v4, 0x12

    if-ne v3, v4, :cond_6

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    :try_start_1
    new-instance v4, Landroidx/constraintlayout/widget/c;

    invoke-direct {v4}, Landroidx/constraintlayout/widget/c;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Landroidx/constraintlayout/widget/c;->d(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p1, p2}, Lo/f;->J(I)V

    return-void
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    move v2, v1

    :cond_0
    return v2
.end method


# virtual methods
.method public a(ZLandroid/view/View;Lo/e;Landroidx/constraintlayout/widget/ConstraintLayout$a;Landroid/util/SparseArray;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/view/View;",
            "Lo/e;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$a;",
            "Landroid/util/SparseArray<",
            "Lo/e;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    sget-object v5, Lo/d$a;->c:Lo/d$a;

    sget-object v6, Lo/d$a;->a:Lo/d$a;

    sget-object v7, Lo/d$a;->d:Lo/d$a;

    sget-object v8, Lo/d$a;->b:Lo/d$a;

    invoke-virtual/range {p4 .. p4}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getVisibility()I

    move-result v9

    .line 1
    iput v9, v2, Lo/e;->X:I

    .line 2
    iget-boolean v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    const/4 v10, 0x1

    if-eqz v9, :cond_0

    .line 3
    iput-boolean v10, v2, Lo/e;->x:Z

    const/16 v9, 0x8

    .line 4
    iput v9, v2, Lo/e;->X:I

    .line 5
    :cond_0
    iput-object v1, v2, Lo/e;->W:Ljava/lang/Object;

    .line 6
    instance-of v9, v1, Landroidx/constraintlayout/widget/b;

    if-eqz v9, :cond_1

    check-cast v1, Landroidx/constraintlayout/widget/b;

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 7
    iget-boolean v9, v9, Lo/f;->i0:Z

    .line 8
    invoke-virtual {v1, v2, v9}, Landroidx/constraintlayout/widget/b;->f(Lo/e;Z)V

    :cond_1
    iget-boolean v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    const/4 v9, -0x1

    if-eqz v1, :cond_4

    move-object v1, v2

    check-cast v1, Lo/g;

    iget v2, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i0:I

    iget v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j0:I

    iget v3, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v6, v3, v5

    if-eqz v6, :cond_2

    if-lez v6, :cond_28

    .line 9
    iput v3, v1, Lo/g;->e0:F

    iput v9, v1, Lo/g;->f0:I

    iput v9, v1, Lo/g;->g0:I

    goto/16 :goto_14

    :cond_2
    if-eq v2, v9, :cond_3

    if-le v2, v9, :cond_28

    .line 10
    iput v5, v1, Lo/g;->e0:F

    iput v2, v1, Lo/g;->f0:I

    iput v9, v1, Lo/g;->g0:I

    goto/16 :goto_14

    :cond_3
    if-eq v4, v9, :cond_28

    if-le v4, v9, :cond_28

    .line 11
    iput v5, v1, Lo/g;->e0:F

    iput v9, v1, Lo/g;->f0:I

    iput v4, v1, Lo/g;->g0:I

    goto/16 :goto_14

    .line 12
    :cond_4
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b0:I

    iget v11, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c0:I

    iget v12, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d0:I

    iget v13, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e0:I

    iget v14, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f0:I

    iget v15, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g0:I

    iget v10, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h0:F

    iget v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    move/from16 v17, v10

    const/4 v10, -0x1

    if-eq v9, v10, :cond_5

    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_11

    iget v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    .line 13
    sget-object v10, Lo/d$a;->f:Lo/d$a;

    .line 14
    invoke-virtual {v2, v10}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v1, v10}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    const/4 v10, 0x0

    const/4 v12, 0x1

    invoke-virtual {v11, v1, v9, v10, v12}, Lo/d;->a(Lo/d;IIZ)Z

    .line 15
    iput v4, v2, Lo/e;->v:F

    goto/16 :goto_9

    :cond_5
    move v9, v10

    if-eq v1, v9, :cond_6

    .line 16
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_7

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    invoke-virtual {v2, v6}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v1, v6}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    :goto_0
    const/4 v9, 0x1

    goto :goto_1

    :cond_6
    if-eq v11, v9, :cond_8

    .line 18
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_7

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 19
    invoke-virtual {v2, v6}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v1, v5}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual {v11, v1, v10, v14, v9}, Lo/d;->a(Lo/d;IIZ)Z

    :cond_7
    const/4 v1, -0x1

    goto :goto_2

    :cond_8
    move v1, v9

    :goto_2
    if-eq v12, v1, :cond_9

    .line 20
    invoke-virtual {v4, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo/e;

    if-eqz v9, :cond_a

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 21
    invoke-virtual {v2, v5}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v9, v6}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v9

    :goto_3
    const/4 v1, 0x1

    goto :goto_4

    :cond_9
    if-eq v13, v1, :cond_a

    .line 22
    invoke-virtual {v4, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_a

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 23
    invoke-virtual {v2, v5}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v1, v5}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v9

    goto :goto_3

    :goto_4
    invoke-virtual {v11, v9, v10, v15, v1}, Lo/d;->a(Lo/d;IIZ)Z

    .line 24
    :cond_a
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    const/4 v9, -0x1

    if-eq v1, v9, :cond_b

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_c

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v11, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    .line 25
    invoke-virtual {v2, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v12

    invoke-virtual {v1, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    :goto_5
    const/4 v9, 0x1

    goto :goto_6

    .line 26
    :cond_b
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-eq v1, v9, :cond_c

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_c

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v11, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    .line 27
    invoke-virtual {v2, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v12

    invoke-virtual {v1, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    goto :goto_5

    :goto_6
    invoke-virtual {v12, v1, v10, v11, v9}, Lo/d;->a(Lo/d;IIZ)Z

    .line 28
    :cond_c
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    const/4 v9, -0x1

    if-eq v1, v9, :cond_d

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_e

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v11, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    .line 29
    invoke-virtual {v2, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v12

    invoke-virtual {v1, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    :goto_7
    const/4 v9, 0x1

    goto :goto_8

    .line 30
    :cond_d
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-eq v1, v9, :cond_e

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e;

    if-eqz v1, :cond_e

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v11, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    .line 31
    invoke-virtual {v2, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v12

    invoke-virtual {v1, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    goto :goto_7

    :goto_8
    invoke-virtual {v12, v1, v10, v11, v9}, Lo/d;->a(Lo/d;IIZ)Z

    .line 32
    :cond_e
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    const/4 v9, -0x1

    if-eq v1, v9, :cond_f

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/e;

    if-eqz v4, :cond_f

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    instance-of v9, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    if-eqz v9, :cond_f

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v9, 0x1

    iput-boolean v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    iput-boolean v9, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    sget-object v10, Lo/d$a;->e:Lo/d$a;

    invoke-virtual {v2, v10}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v11

    invoke-virtual {v4, v10}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v4

    const/4 v10, 0x0

    const/4 v12, -0x1

    invoke-virtual {v11, v4, v10, v12, v9}, Lo/d;->a(Lo/d;IIZ)Z

    .line 33
    iput-boolean v9, v2, Lo/e;->w:Z

    .line 34
    iget-object v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    .line 35
    iput-boolean v9, v1, Lo/e;->w:Z

    .line 36
    invoke-virtual {v2, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    invoke-virtual {v1}, Lo/d;->e()V

    invoke-virtual {v2, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    invoke-virtual {v1}, Lo/d;->e()V

    :cond_f
    const/4 v1, 0x0

    cmpl-float v4, v17, v1

    if-ltz v4, :cond_10

    move/from16 v4, v17

    .line 37
    iput v4, v2, Lo/e;->U:F

    .line 38
    :cond_10
    iget v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v9, v4, v1

    if-ltz v9, :cond_11

    .line 39
    iput v4, v2, Lo/e;->V:F

    :cond_11
    :goto_9
    if-eqz p1, :cond_13

    .line 40
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_12

    iget v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-eq v9, v4, :cond_13

    :cond_12
    iget v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    .line 41
    iput v1, v2, Lo/e;->P:I

    iput v4, v2, Lo/e;->Q:I

    .line 42
    :cond_13
    iget-boolean v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    const/4 v4, -0x2

    const/4 v9, 0x2

    const/4 v10, 0x4

    const/4 v11, 0x3

    if-nez v1, :cond_16

    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v12, -0x1

    if-ne v1, v12, :cond_15

    iget-boolean v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    if-eqz v1, :cond_14

    .line 43
    iget-object v1, v2, Lo/e;->J:[I

    const/4 v12, 0x0

    aput v11, v1, v12

    goto :goto_a

    :cond_14
    const/4 v12, 0x0

    iget-object v1, v2, Lo/e;->J:[I

    aput v10, v1, v12

    .line 44
    :goto_a
    invoke-virtual {v2, v6}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    iget v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, v1, Lo/d;->e:I

    invoke-virtual {v2, v5}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v5, v1, Lo/d;->e:I

    goto :goto_b

    :cond_15
    const/4 v12, 0x0

    .line 45
    iget-object v1, v2, Lo/e;->J:[I

    aput v11, v1, v12

    .line 46
    invoke-virtual {v2, v12}, Lo/e;->B(I)V

    goto :goto_b

    :cond_16
    const/4 v12, 0x0

    .line 47
    iget-object v1, v2, Lo/e;->J:[I

    const/4 v5, 0x1

    aput v5, v1, v12

    .line 48
    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v2, v1}, Lo/e;->B(I)V

    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v1, v4, :cond_17

    .line 49
    iget-object v1, v2, Lo/e;->J:[I

    aput v9, v1, v12

    .line 50
    :cond_17
    :goto_b
    iget-boolean v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-nez v1, :cond_1a

    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v5, -0x1

    if-ne v1, v5, :cond_19

    iget-boolean v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    if-eqz v1, :cond_18

    .line 51
    iget-object v1, v2, Lo/e;->J:[I

    const/4 v6, 0x1

    aput v11, v1, v6

    goto :goto_c

    :cond_18
    const/4 v6, 0x1

    iget-object v1, v2, Lo/e;->J:[I

    aput v10, v1, v6

    .line 52
    :goto_c
    invoke-virtual {v2, v8}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v4, v1, Lo/d;->e:I

    invoke-virtual {v2, v7}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v1

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v4, v1, Lo/d;->e:I

    goto :goto_d

    :cond_19
    const/4 v6, 0x1

    .line 53
    iget-object v1, v2, Lo/e;->J:[I

    aput v11, v1, v6

    const/4 v1, 0x0

    .line 54
    invoke-virtual {v2, v1}, Lo/e;->w(I)V

    goto :goto_d

    :cond_1a
    const/4 v5, -0x1

    const/4 v6, 0x1

    .line 55
    iget-object v1, v2, Lo/e;->J:[I

    aput v6, v1, v6

    .line 56
    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v2, v1}, Lo/e;->w(I)V

    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v1, v4, :cond_1b

    .line 57
    iget-object v1, v2, Lo/e;->J:[I

    aput v9, v1, v6

    .line 58
    :cond_1b
    :goto_d
    iget-object v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    if-eqz v1, :cond_23

    .line 59
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1c

    goto/16 :goto_11

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v6, 0x2c

    invoke-virtual {v1, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-lez v6, :cond_1f

    add-int/lit8 v7, v4, -0x1

    if-ge v6, v7, :cond_1f

    const/4 v7, 0x0

    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v7, "W"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const/4 v7, 0x1

    const/16 v16, 0x0

    goto :goto_e

    :cond_1d
    const-string v7, "H"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1e

    const/4 v7, 0x1

    const/16 v16, 0x1

    goto :goto_e

    :cond_1e
    move/from16 v16, v5

    const/4 v7, 0x1

    :goto_e
    add-int/lit8 v10, v6, 0x1

    move/from16 v5, v16

    goto :goto_f

    :cond_1f
    const/4 v7, 0x1

    const/4 v10, 0x0

    :goto_f
    const/16 v6, 0x3a

    invoke-virtual {v1, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_21

    sub-int/2addr v4, v7

    if-ge v6, v4, :cond_21

    invoke-virtual {v1, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    add-int/2addr v6, v7

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_22

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_22

    :try_start_0
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    const/4 v6, 0x0

    cmpl-float v7, v4, v6

    if-lez v7, :cond_22

    cmpl-float v7, v1, v6

    if-lez v7, :cond_22

    const/4 v6, 0x1

    if-ne v5, v6, :cond_20

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    goto :goto_10

    :cond_20
    div-float/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_10

    :cond_21
    invoke-virtual {v1, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    :try_start_1
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_10

    :catch_0
    :cond_22
    const/4 v1, 0x0

    :goto_10
    const/4 v4, 0x0

    cmpl-float v6, v1, v4

    if-lez v6, :cond_24

    iput v1, v2, Lo/e;->N:F

    iput v5, v2, Lo/e;->O:I

    goto :goto_12

    :cond_23
    :goto_11
    const/4 v4, 0x0

    iput v4, v2, Lo/e;->N:F

    .line 60
    :cond_24
    :goto_12
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    .line 61
    iget-object v4, v2, Lo/e;->b0:[F

    const/4 v10, 0x0

    aput v1, v4, v10

    .line 62
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    const/4 v5, 0x1

    .line 63
    aput v1, v4, v5

    .line 64
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    .line 65
    iput v1, v2, Lo/e;->Z:I

    .line 66
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    .line 67
    iput v1, v2, Lo/e;->a0:I

    .line 68
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v5, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v6, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    .line 69
    iput v1, v2, Lo/e;->j:I

    iput v4, v2, Lo/e;->m:I

    const v4, 0x7fffffff

    if-ne v5, v4, :cond_25

    move v5, v10

    :cond_25
    iput v5, v2, Lo/e;->n:I

    iput v6, v2, Lo/e;->o:F

    const/4 v5, 0x0

    cmpl-float v7, v6, v5

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v7, :cond_26

    cmpg-float v6, v6, v5

    if-gez v6, :cond_26

    if-nez v1, :cond_26

    iput v9, v2, Lo/e;->j:I

    .line 70
    :cond_26
    iget v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v6, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v7, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v3, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    .line 71
    iput v1, v2, Lo/e;->k:I

    iput v6, v2, Lo/e;->p:I

    if-ne v7, v4, :cond_27

    goto :goto_13

    :cond_27
    move v10, v7

    :goto_13
    iput v10, v2, Lo/e;->q:I

    iput v3, v2, Lo/e;->r:F

    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    if-lez v4, :cond_28

    cmpg-float v3, v3, v5

    if-gez v3, :cond_28

    if-nez v1, :cond_28

    iput v9, v2, Lo/e;->k:I

    :cond_28
    :goto_14
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b()Landroidx/constraintlayout/widget/ConstraintLayout$a;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(II)V

    return-object v0
.end method

.method public c(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    return p1
.end method

.method public d(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/b;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x44870000    # 1080.0f

    const/high16 v6, 0x44f00000    # 1920.0f

    move v7, v2

    :goto_1
    if-ge v7, v1, :cond_3

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_2

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_2

    check-cast v8, Ljava/lang/String;

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x4

    if-ne v9, v10, :cond_2

    aget-object v9, v8, v2

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x1

    aget-object v10, v8, v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x2

    aget-object v11, v8, v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/4 v12, 0x3

    aget-object v8, v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    int-to-float v9, v9

    div-float/2addr v9, v5

    mul-float/2addr v9, v3

    float-to-int v9, v9

    int-to-float v10, v10

    div-float/2addr v10, v6

    mul-float/2addr v10, v4

    float-to-int v10, v10

    int-to-float v11, v11

    div-float/2addr v11, v5

    mul-float/2addr v11, v3

    float-to-int v11, v11

    int-to-float v8, v8

    div-float/2addr v8, v6

    mul-float/2addr v8, v4

    float-to-int v8, v8

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v12, -0x10000

    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v9

    int-to-float v13, v10

    add-int/2addr v9, v11

    int-to-float v9, v9

    move-object/from16 v12, p1

    move v11, v13

    move v13, v14

    move/from16 v18, v14

    move v14, v11

    move-object/from16 v19, v15

    move v15, v9

    move/from16 v16, v11

    move-object/from16 v17, v19

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v10, v8

    int-to-float v8, v10

    move v13, v9

    move/from16 v16, v8

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v15, v18

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v18

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v10, -0xff0100

    move-object/from16 v15, v19

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    move v14, v11

    move-object v10, v15

    move v15, v9

    move/from16 v16, v8

    move-object/from16 v17, v10

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final e(Landroid/view/View;)Lo/e;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    :goto_0
    return-object p1
.end method

.method public f()Z
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v0

    if-ne v2, v0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public forceLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    .line 2
    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public g(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 1
    iget v0, v0, Lo/f;->q0:I

    return v0
.end method

.method public final h()Z
    .locals 24

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->isLayoutRequested()Z

    move-result v4

    if-eqz v4, :cond_0

    move v8, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v8, v1

    :goto_1
    if-eqz v8, :cond_30

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    move v0, v1

    :goto_2
    if-ge v0, v10, :cond_3

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Lo/e;->u()V

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, -0x1

    if-eqz v9, :cond_9

    move v2, v1

    :goto_4
    if-ge v2, v10, :cond_9

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v1, v5, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v6, 0x2f

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v0, :cond_4

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_5

    .line 2
    :cond_5
    iget-object v6, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    if-nez v6, :cond_6

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_6

    if-eq v6, v7, :cond_6

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-ne v4, v7, :cond_6

    invoke-virtual {v7, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_6
    if-ne v6, v7, :cond_7

    :goto_5
    iget-object v4, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    goto :goto_6

    :cond_7
    if-nez v6, :cond_8

    const/4 v4, 0x0

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v4, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    .line 3
    :goto_6
    iput-object v5, v4, Lo/e;->Y:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 4
    :cond_9
    iget v2, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-eq v2, v0, :cond_b

    move v2, v1

    :goto_7
    if-ge v2, v10, :cond_b

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    iget v6, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-ne v5, v6, :cond_a

    instance-of v5, v4, Landroidx/constraintlayout/widget/d;

    if-eqz v5, :cond_a

    check-cast v4, Landroidx/constraintlayout/widget/d;

    invoke-virtual {v4}, Landroidx/constraintlayout/widget/d;->getConstraintSet()Landroidx/constraintlayout/widget/c;

    move-result-object v4

    iput-object v4, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_b
    iget-object v2, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    if-eqz v2, :cond_20

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    new-instance v5, Ljava/util/HashSet;

    iget-object v6, v2, Landroidx/constraintlayout/widget/c;->c:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    :goto_8
    if-ge v1, v4, :cond_1a

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v11

    iget-object v12, v2, Landroidx/constraintlayout/widget/c;->c:Ljava/util/HashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "ConstraintSet"

    if-nez v12, :cond_c

    const-string v0, "id unknown "

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 6
    :try_start_1
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    const-string v3, "UNKNOWN"

    .line 7
    :goto_9
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    :cond_c
    iget-boolean v12, v2, Landroidx/constraintlayout/widget/c;->b:Z

    if-eqz v12, :cond_e

    if-eq v11, v0, :cond_d

    goto :goto_a

    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_a
    if-ne v11, v0, :cond_f

    :goto_b
    move/from16 v16, v4

    move/from16 v18, v8

    move/from16 v20, v9

    move/from16 v21, v10

    goto/16 :goto_12

    :cond_f
    iget-object v12, v2, Landroidx/constraintlayout/widget/c;->c:Ljava/util/HashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v12, v2, Landroidx/constraintlayout/widget/c;->c:Ljava/util/HashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/constraintlayout/widget/c$a;

    instance-of v13, v6, Landroidx/constraintlayout/widget/a;

    if-eqz v13, :cond_10

    iget-object v13, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iput v3, v13, Landroidx/constraintlayout/widget/c$b;->d0:I

    :cond_10
    iget-object v13, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v13, v13, Landroidx/constraintlayout/widget/c$b;->d0:I

    if-eq v13, v0, :cond_13

    if-eq v13, v3, :cond_11

    goto :goto_c

    :cond_11
    move-object v0, v6

    check-cast v0, Landroidx/constraintlayout/widget/a;

    invoke-virtual {v0, v11}, Landroid/view/View;->setId(I)V

    iget-object v3, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v3, v3, Landroidx/constraintlayout/widget/c$b;->b0:I

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/a;->setType(I)V

    iget-object v3, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v3, v3, Landroidx/constraintlayout/widget/c$b;->c0:I

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/a;->setMargin(I)V

    iget-object v3, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-boolean v3, v3, Landroidx/constraintlayout/widget/c$b;->j0:Z

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/a;->setAllowsGoneWidget(Z)V

    iget-object v3, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-object v11, v3, Landroidx/constraintlayout/widget/c$b;->e0:[I

    if-eqz v11, :cond_12

    invoke-virtual {v0, v11}, Landroidx/constraintlayout/widget/b;->setReferencedIds([I)V

    goto :goto_c

    :cond_12
    iget-object v11, v3, Landroidx/constraintlayout/widget/c$b;->f0:Ljava/lang/String;

    if-eqz v11, :cond_13

    invoke-virtual {v2, v0, v11}, Landroidx/constraintlayout/widget/c;->b(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v11

    iput-object v11, v3, Landroidx/constraintlayout/widget/c$b;->e0:[I

    iget-object v3, v12, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-object v3, v3, Landroidx/constraintlayout/widget/c$b;->e0:[I

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/b;->setReferencedIds([I)V

    :cond_13
    :goto_c
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {v3}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    invoke-virtual {v12, v3}, Landroidx/constraintlayout/widget/c$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    iget-object v11, v12, Landroidx/constraintlayout/widget/c$a;->f:Ljava/util/HashMap;

    const-string v13, "\" not found on "

    const-string v14, " Custom Attribute \""

    const-string v15, "TransitionLayout"

    move/from16 v16, v4

    .line 8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v11}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_d
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move/from16 v18, v8

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v11, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/a;

    move-object/from16 v19, v11

    const-string v11, "set"

    invoke-static {v11, v8}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move/from16 v20, v9

    :try_start_2
    iget v9, v0, Lq/a;->b:I

    invoke-static {v9}, Ln/g;->a(I)I

    move-result v9
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_5

    packed-switch v9, :pswitch_data_0

    move/from16 v8, v18

    move-object/from16 v11, v19

    move/from16 v9, v20

    goto :goto_d

    :pswitch_0
    const/4 v9, 0x1

    move/from16 v21, v10

    :try_start_3
    new-array v10, v9, [Ljava/lang/Class;

    sget-object v22, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget v0, v0, Lq/a;->d:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_1
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Class;

    sget-object v22, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget-boolean v0, v0, Lq/a;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_2
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Class;

    const-class v22, Ljava/lang/CharSequence;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget-object v0, v0, Lq/a;->e:Ljava/lang/String;

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_3
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Class;

    const-class v10, Landroid/graphics/drawable/Drawable;

    const/16 v22, 0x0

    aput-object v10, v9, v22

    invoke-virtual {v4, v11, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-instance v10, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v10}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iget v0, v0, Lq/a;->g:I

    invoke-virtual {v10, v0}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v22, 0x0

    aput-object v10, v0, v22

    invoke-virtual {v9, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_4
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Class;

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget v0, v0, Lq/a;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_5
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Class;

    sget-object v22, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget v0, v0, Lq/a;->d:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_11

    :pswitch_6
    move/from16 v21, v10

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Class;

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x0

    aput-object v22, v10, v23

    invoke-virtual {v4, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v9, v9, [Ljava/lang/Object;

    iget v0, v0, Lq/a;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v23

    invoke-virtual {v10, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_11

    :catch_2
    move-exception v0

    goto :goto_e

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    goto :goto_10

    :catch_5
    move-exception v0

    move/from16 v21, v10

    :goto_e
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v15, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_11

    :catch_6
    move-exception v0

    move/from16 v21, v10

    :goto_f
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v15, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_11

    :catch_7
    move-exception v0

    move/from16 v21, v10

    :goto_10
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " must have a method "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_11
    move/from16 v8, v18

    move-object/from16 v11, v19

    move/from16 v9, v20

    move/from16 v10, v21

    goto/16 :goto_d

    :cond_14
    move/from16 v18, v8

    move/from16 v20, v9

    move/from16 v21, v10

    .line 9
    invoke-virtual {v6, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    iget v3, v0, Landroidx/constraintlayout/widget/c$d;->c:I

    if-nez v3, :cond_15

    iget v0, v0, Landroidx/constraintlayout/widget/c$d;->b:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_15
    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    iget v0, v0, Landroidx/constraintlayout/widget/c$d;->d:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->b:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setRotation(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->c:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setRotationX(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->d:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setRotationY(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->e:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->f:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setScaleY(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->g:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->g:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setPivotX(F)V

    :cond_16
    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->h:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setPivotY(F)V

    :cond_17
    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->i:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->j:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->k:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setTranslationZ(F)V

    iget-object v0, v12, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget-boolean v3, v0, Landroidx/constraintlayout/widget/c$e;->l:Z

    if-eqz v3, :cond_19

    iget v0, v0, Landroidx/constraintlayout/widget/c$e;->m:F

    invoke-virtual {v6, v0}, Landroid/view/View;->setElevation(F)V

    goto :goto_12

    :cond_18
    move/from16 v16, v4

    move/from16 v18, v8

    move/from16 v20, v9

    move/from16 v21, v10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WARNING NO CONSTRAINTS for view "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_19
    :goto_12
    add-int/lit8 v1, v1, 0x1

    const/4 v0, -0x1

    const/4 v3, 0x1

    move/from16 v4, v16

    move/from16 v8, v18

    move/from16 v9, v20

    move/from16 v10, v21

    goto/16 :goto_8

    :cond_1a
    move/from16 v18, v8

    move/from16 v20, v9

    move/from16 v21, v10

    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v3, v2, Landroidx/constraintlayout/widget/c;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/c$a;

    iget-object v4, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v4, v4, Landroidx/constraintlayout/widget/c$b;->d0:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1f

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1c

    goto :goto_15

    :cond_1c
    new-instance v4, Landroidx/constraintlayout/widget/a;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroidx/constraintlayout/widget/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    iget-object v5, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-object v6, v5, Landroidx/constraintlayout/widget/c$b;->e0:[I

    if-eqz v6, :cond_1d

    invoke-virtual {v4, v6}, Landroidx/constraintlayout/widget/b;->setReferencedIds([I)V

    goto :goto_14

    :cond_1d
    iget-object v6, v5, Landroidx/constraintlayout/widget/c$b;->f0:Ljava/lang/String;

    if-eqz v6, :cond_1e

    invoke-virtual {v2, v4, v6}, Landroidx/constraintlayout/widget/c;->b(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v6

    iput-object v6, v5, Landroidx/constraintlayout/widget/c$b;->e0:[I

    iget-object v5, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-object v5, v5, Landroidx/constraintlayout/widget/c$b;->e0:[I

    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/b;->setReferencedIds([I)V

    :cond_1e
    :goto_14
    iget-object v5, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v5, v5, Landroidx/constraintlayout/widget/c$b;->b0:I

    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/a;->setType(I)V

    iget-object v5, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v5, v5, Landroidx/constraintlayout/widget/c$b;->c0:I

    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/a;->setMargin(I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v5

    invoke-virtual {v4}, Landroidx/constraintlayout/widget/b;->g()V

    invoke-virtual {v3, v5}, Landroidx/constraintlayout/widget/c$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    invoke-virtual {v7, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1f
    :goto_15
    iget-object v4, v3, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-boolean v4, v4, Landroidx/constraintlayout/widget/c$b;->a:Z

    if-eqz v4, :cond_1b

    new-instance v4, Landroidx/constraintlayout/widget/e;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroidx/constraintlayout/widget/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/view/View;->setId(I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/constraintlayout/widget/c$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    invoke-virtual {v7, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_13

    :cond_20
    move/from16 v18, v8

    move/from16 v20, v9

    move/from16 v21, v10

    .line 10
    :cond_21
    iget-object v0, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 11
    iget-object v0, v0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    iget-object v0, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_29

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v0, :cond_29

    iget-object v2, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/b;

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-eqz v3, :cond_22

    iget-object v3, v2, Landroidx/constraintlayout/widget/b;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroidx/constraintlayout/widget/b;->setIds(Ljava/lang/String;)V

    :cond_22
    iget-object v3, v2, Landroidx/constraintlayout/widget/b;->e:Lo/h;

    if-nez v3, :cond_23

    goto/16 :goto_19

    :cond_23
    check-cast v3, Lo/i;

    const/4 v4, 0x0

    .line 14
    iput v4, v3, Lo/i;->f0:I

    iget-object v3, v3, Lo/i;->e0:[Lo/e;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x0

    .line 15
    :goto_17
    iget v4, v2, Landroidx/constraintlayout/widget/b;->c:I

    if-ge v3, v4, :cond_28

    iget-object v4, v2, Landroidx/constraintlayout/widget/b;->b:[I

    aget v4, v4, v3

    invoke-virtual {v7, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_24

    iget-object v6, v2, Landroidx/constraintlayout/widget/b;->g:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v7, v4}, Landroidx/constraintlayout/widget/b;->d(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_24

    iget-object v5, v2, Landroidx/constraintlayout/widget/b;->b:[I

    aput v6, v5, v3

    iget-object v5, v2, Landroidx/constraintlayout/widget/b;->g:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(I)Landroid/view/View;

    move-result-object v5

    :cond_24
    if-eqz v5, :cond_27

    iget-object v4, v2, Landroidx/constraintlayout/widget/b;->e:Lo/h;

    invoke-virtual {v7, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v5

    check-cast v4, Lo/i;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v5, v4, :cond_27

    if-nez v5, :cond_25

    goto :goto_18

    .line 16
    :cond_25
    iget v6, v4, Lo/i;->f0:I

    add-int/lit8 v6, v6, 0x1

    iget-object v8, v4, Lo/i;->e0:[Lo/e;

    array-length v9, v8

    if-le v6, v9, :cond_26

    array-length v6, v8

    mul-int/lit8 v6, v6, 0x2

    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lo/e;

    iput-object v6, v4, Lo/i;->e0:[Lo/e;

    :cond_26
    iget-object v6, v4, Lo/i;->e0:[Lo/e;

    iget v8, v4, Lo/i;->f0:I

    aput-object v5, v6, v8

    add-int/lit8 v8, v8, 0x1

    iput v8, v4, Lo/i;->f0:I

    :cond_27
    :goto_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    .line 17
    :cond_28
    iget-object v2, v2, Landroidx/constraintlayout/widget/b;->e:Lo/h;

    iget-object v3, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-interface {v2, v3}, Lo/h;->a(Lo/f;)V

    :goto_19
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_16

    :cond_29
    const/4 v0, 0x0

    move/from16 v8, v21

    :goto_1a
    if-ge v0, v8, :cond_2c

    .line 18
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v2, v1, Landroidx/constraintlayout/widget/f;

    if-eqz v2, :cond_2b

    check-cast v1, Landroidx/constraintlayout/widget/f;

    .line 19
    iget v2, v1, Landroidx/constraintlayout/widget/f;->b:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2a

    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_2a

    iget v2, v1, Landroidx/constraintlayout/widget/f;->d:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2a
    iget v2, v1, Landroidx/constraintlayout/widget/f;->b:I

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v1, Landroidx/constraintlayout/widget/f;->c:Landroid/view/View;

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v3, 0x1

    iput-boolean v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    iget-object v2, v1, Landroidx/constraintlayout/widget/f;->c:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_2b
    add-int/lit8 v0, v0, 0x1

    goto :goto_1a

    :cond_2c
    const/4 v0, 0x0

    .line 20
    iget-object v1, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    iget-object v1, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    iget-object v2, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v1, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    iget-object v3, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move v1, v0

    :goto_1b
    if-ge v1, v8, :cond_2d

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v3

    iget-object v4, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v4, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    :cond_2d
    :goto_1c
    if-ge v0, v8, :cond_31

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v4

    if-nez v4, :cond_2e

    goto :goto_1d

    :cond_2e
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v1, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 21
    iget-object v2, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v2, v4, Lo/e;->K:Lo/e;

    if-eqz v2, :cond_2f

    .line 23
    check-cast v2, Lo/l;

    .line 24
    iget-object v2, v2, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    .line 25
    iput-object v2, v4, Lo/e;->K:Lo/e;

    .line 26
    :cond_2f
    iput-object v1, v4, Lo/e;->K:Lo/e;

    .line 27
    iget-object v6, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    move-object/from16 v1, p0

    move/from16 v2, v20

    invoke-virtual/range {v1 .. v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ZLandroid/view/View;Lo/e;Landroidx/constraintlayout/widget/ConstraintLayout$a;Landroid/util/SparseArray;)V

    :goto_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_1c

    :cond_30
    move/from16 v18, v8

    :cond_31
    return v18

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLayout(ZIIII)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_3

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lo/e;->p()I

    move-result v0

    invoke-virtual {v1}, Lo/e;->q()I

    move-result v2

    invoke-virtual {v1}, Lo/e;->o()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lo/e;->i()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    instance-of v4, p5, Landroidx/constraintlayout/widget/f;

    if-eqz v4, :cond_2

    check-cast p5, Landroidx/constraintlayout/widget/f;

    invoke-virtual {p5}, Landroidx/constraintlayout/widget/f;->getContent()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_2
    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    :goto_2
    if-ge p3, p1, :cond_4

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public onMeasure(II)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->f()Z

    move-result v4

    .line 1
    iput-boolean v4, v3, Lo/f;->i0:Z

    .line 2
    iget-boolean v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x3

    if-eqz v3, :cond_3

    iput-boolean v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 3
    iget-object v7, v3, Lo/f;->f0:Lp/b;

    .line 4
    iget-object v8, v7, Lp/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    iget-object v8, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v4

    :goto_0
    if-ge v9, v8, :cond_2

    iget-object v10, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/e;

    invoke-virtual {v10}, Lo/e;->j()I

    move-result v11

    if-eq v11, v6, :cond_0

    invoke-virtual {v10}, Lo/e;->j()I

    move-result v11

    if-eq v11, v5, :cond_0

    invoke-virtual {v10}, Lo/e;->n()I

    move-result v11

    if-eq v11, v6, :cond_0

    invoke-virtual {v10}, Lo/e;->n()I

    move-result v11

    if-ne v11, v5, :cond_1

    :cond_0
    iget-object v11, v7, Lp/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lo/f;->I()V

    .line 5
    :cond_3
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 6
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v9

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v12

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v13

    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    add-int v14, v12, v13

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v15

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 7
    iput v12, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b:I

    iput v13, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->c:I

    iput v15, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    iput v14, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iput v1, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    iput v2, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    .line 8
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingEnd()I

    move-result v13

    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    if-gtz v5, :cond_5

    if-lez v13, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->f()Z

    move-result v16

    if-eqz v16, :cond_6

    move v5, v13

    :cond_6
    :goto_2
    sub-int/2addr v9, v15

    sub-int/2addr v11, v14

    .line 9
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iget v13, v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v15

    const/high16 v6, -0x80000000

    if-eq v8, v6, :cond_a

    if-eqz v8, :cond_8

    const/high16 v4, 0x40000000    # 2.0f

    if-eq v8, v4, :cond_7

    const/4 v4, 0x1

    goto :goto_3

    :cond_7
    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v4, v13

    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    move-result v4

    move v2, v6

    const/4 v6, 0x1

    goto :goto_6

    :cond_8
    if-nez v15, :cond_9

    goto :goto_4

    :cond_9
    const/4 v4, 0x2

    :goto_3
    move v2, v6

    move v6, v4

    const/4 v4, 0x0

    goto :goto_6

    :cond_a
    if-nez v15, :cond_b

    :goto_4
    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const/4 v6, 0x0

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_5

    :cond_b
    move v4, v9

    :goto_5
    const/high16 v2, -0x80000000

    const/4 v6, 0x2

    :goto_6
    if-eq v10, v2, :cond_f

    if-eqz v10, :cond_d

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v10, v2, :cond_c

    const/4 v2, 0x1

    goto :goto_7

    :cond_c
    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v2, v14

    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v15, 0x1

    goto :goto_a

    :cond_d
    if-nez v15, :cond_e

    goto :goto_8

    :cond_e
    const/4 v2, 0x2

    :goto_7
    move v15, v2

    const/4 v2, 0x0

    goto :goto_a

    :cond_f
    if-nez v15, :cond_10

    :goto_8
    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const/4 v15, 0x0

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_9

    :cond_10
    move v2, v11

    :goto_9
    const/4 v15, 0x2

    :goto_a
    invoke-virtual {v3}, Lo/e;->o()I

    move-result v1

    if-ne v4, v1, :cond_12

    invoke-virtual {v3}, Lo/e;->i()I

    move-result v1

    if-eq v2, v1, :cond_11

    goto :goto_b

    :cond_11
    move/from16 v20, v11

    const/4 v1, 0x0

    const/4 v11, 0x1

    goto :goto_c

    .line 10
    :cond_12
    :goto_b
    iget-object v1, v3, Lo/f;->g0:Lp/e;

    move/from16 v20, v11

    const/4 v11, 0x1

    .line 11
    iput-boolean v11, v1, Lp/e;->c:Z

    const/4 v1, 0x0

    .line 12
    :goto_c
    iput v1, v3, Lo/e;->P:I

    .line 13
    iput v1, v3, Lo/e;->Q:I

    .line 14
    iget v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v11, v13

    move/from16 v21, v9

    .line 15
    iget-object v9, v3, Lo/e;->u:[I

    aput v11, v9, v1

    .line 16
    iget v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v11, v14

    const/16 v19, 0x1

    .line 17
    aput v11, v9, v19

    .line 18
    invoke-virtual {v3, v1}, Lo/e;->z(I)V

    invoke-virtual {v3, v1}, Lo/e;->y(I)V

    .line 19
    iget-object v9, v3, Lo/e;->J:[I

    aput v6, v9, v1

    .line 20
    invoke-virtual {v3, v4}, Lo/e;->B(I)V

    .line 21
    iget-object v1, v3, Lo/e;->J:[I

    aput v15, v1, v19

    .line 22
    invoke-virtual {v3, v2}, Lo/e;->w(I)V

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int/2addr v1, v13

    invoke-virtual {v3, v1}, Lo/e;->z(I)V

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v1, v14

    invoke-virtual {v3, v1}, Lo/e;->y(I)V

    .line 23
    iput v5, v3, Lo/f;->k0:I

    iput v12, v3, Lo/f;->l0:I

    iget-object v1, v3, Lo/f;->f0:Lp/b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v2, Lo/d$a;->d:Lo/d$a;

    sget-object v4, Lo/d$a;->c:Lo/d$a;

    iget-object v5, v3, Lo/f;->h0:Lp/b$b;

    .line 25
    iget-object v6, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v3}, Lo/e;->o()I

    move-result v9

    invoke-virtual {v3}, Lo/e;->i()I

    move-result v11

    const/16 v12, 0x80

    invoke-static {v7, v12}, Lo/j;->a(II)Z

    move-result v12

    if-nez v12, :cond_14

    const/16 v13, 0x40

    invoke-static {v7, v13}, Lo/j;->a(II)Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_d

    :cond_13
    const/4 v7, 0x0

    goto :goto_e

    :cond_14
    :goto_d
    const/4 v7, 0x1

    :goto_e
    if-eqz v7, :cond_1d

    const/4 v13, 0x0

    :goto_f
    if-ge v13, v6, :cond_1d

    iget-object v14, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo/e;

    invoke-virtual {v14}, Lo/e;->j()I

    move-result v15

    move/from16 v22, v7

    const/4 v7, 0x3

    if-ne v15, v7, :cond_15

    const/4 v15, 0x1

    goto :goto_10

    :cond_15
    const/4 v15, 0x0

    :goto_10
    invoke-virtual {v14}, Lo/e;->n()I

    move-result v0

    if-ne v0, v7, :cond_16

    const/4 v0, 0x1

    goto :goto_11

    :cond_16
    const/4 v0, 0x0

    :goto_11
    if-eqz v15, :cond_17

    if-eqz v0, :cond_17

    .line 26
    iget v0, v14, Lo/e;->N:F

    const/4 v7, 0x0

    cmpl-float v0, v0, v7

    if-lez v0, :cond_17

    const/4 v0, 0x1

    goto :goto_12

    :cond_17
    const/4 v0, 0x0

    .line 27
    :goto_12
    invoke-virtual {v14}, Lo/e;->s()Z

    move-result v7

    if-eqz v7, :cond_18

    if-eqz v0, :cond_18

    goto :goto_13

    :cond_18
    invoke-virtual {v14}, Lo/e;->t()Z

    move-result v7

    if-eqz v7, :cond_19

    if-eqz v0, :cond_19

    goto :goto_13

    :cond_19
    instance-of v0, v14, Lo/k;

    if-eqz v0, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-virtual {v14}, Lo/e;->s()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-virtual {v14}, Lo/e;->t()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_13

    :cond_1b
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move/from16 v7, v22

    goto :goto_f

    :cond_1c
    :goto_13
    const/high16 v0, 0x40000000    # 2.0f

    const/16 v22, 0x0

    goto :goto_14

    :cond_1d
    move/from16 v22, v7

    const/high16 v0, 0x40000000    # 2.0f

    :goto_14
    if-ne v8, v0, :cond_1e

    if-eq v10, v0, :cond_1f

    :cond_1e
    if-eqz v12, :cond_20

    :cond_1f
    const/4 v0, 0x1

    goto :goto_15

    :cond_20
    const/4 v0, 0x0

    :goto_15
    and-int v0, v22, v0

    if-eqz v0, :cond_3f

    .line 28
    iget-object v0, v3, Lo/e;->u:[I

    const/4 v7, 0x0

    aget v0, v0, v7

    move/from16 v7, v21

    .line 29
    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 30
    iget-object v7, v3, Lo/e;->u:[I

    const/4 v13, 0x1

    aget v7, v7, v13

    move/from16 v13, v20

    .line 31
    invoke-static {v7, v13}, Ljava/lang/Math;->min(II)I

    move-result v7

    const/high16 v13, 0x40000000    # 2.0f

    if-ne v8, v13, :cond_21

    invoke-virtual {v3}, Lo/e;->o()I

    move-result v14

    if-eq v14, v0, :cond_21

    invoke-virtual {v3, v0}, Lo/e;->B(I)V

    invoke-virtual {v3}, Lo/f;->I()V

    :cond_21
    if-ne v10, v13, :cond_22

    invoke-virtual {v3}, Lo/e;->i()I

    move-result v0

    if-eq v0, v7, :cond_22

    invoke-virtual {v3, v7}, Lo/e;->w(I)V

    invoke-virtual {v3}, Lo/f;->I()V

    :cond_22
    if-ne v8, v13, :cond_38

    if-ne v10, v13, :cond_38

    .line 32
    iget-object v0, v3, Lo/f;->g0:Lp/e;

    const/4 v7, 0x1

    and-int/2addr v12, v7

    .line 33
    iget-boolean v7, v0, Lp/e;->b:Z

    if-nez v7, :cond_24

    iget-boolean v7, v0, Lp/e;->c:Z

    if-eqz v7, :cond_23

    goto :goto_16

    :cond_23
    const/4 v14, 0x0

    goto :goto_18

    :cond_24
    :goto_16
    iget-object v7, v0, Lp/e;->a:Lo/f;

    iget-object v7, v7, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_25

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo/e;

    const/4 v14, 0x0

    iput-boolean v14, v13, Lo/e;->a:Z

    iget-object v15, v13, Lo/e;->d:Lp/j;

    invoke-virtual {v15}, Lp/j;->n()V

    iget-object v13, v13, Lo/e;->e:Lp/l;

    invoke-virtual {v13}, Lp/l;->m()V

    goto :goto_17

    :cond_25
    const/4 v14, 0x0

    iget-object v7, v0, Lp/e;->a:Lo/f;

    iput-boolean v14, v7, Lo/e;->a:Z

    iget-object v7, v7, Lo/e;->d:Lp/j;

    invoke-virtual {v7}, Lp/j;->n()V

    iget-object v7, v0, Lp/e;->a:Lo/f;

    iget-object v7, v7, Lo/e;->e:Lp/l;

    invoke-virtual {v7}, Lp/l;->m()V

    iput-boolean v14, v0, Lp/e;->c:Z

    :goto_18
    iget-object v7, v0, Lp/e;->d:Lo/f;

    invoke-virtual {v0, v7}, Lp/e;->b(Lo/f;)Z

    iget-object v7, v0, Lp/e;->a:Lo/f;

    .line 34
    iput v14, v7, Lo/e;->P:I

    .line 35
    iput v14, v7, Lo/e;->Q:I

    .line 36
    invoke-virtual {v7, v14}, Lo/e;->h(I)I

    move-result v7

    iget-object v13, v0, Lp/e;->a:Lo/f;

    const/4 v14, 0x1

    invoke-virtual {v13, v14}, Lo/e;->h(I)I

    move-result v13

    iget-boolean v14, v0, Lp/e;->b:Z

    if-eqz v14, :cond_26

    invoke-virtual {v0}, Lp/e;->c()V

    :cond_26
    iget-object v14, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v14}, Lo/e;->p()I

    move-result v14

    iget-object v15, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v15}, Lo/e;->q()I

    move-result v15

    move-object/from16 v20, v2

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v2, v2, Lo/e;->d:Lp/j;

    iget-object v2, v2, Lp/m;->h:Lp/f;

    invoke-virtual {v2, v14}, Lp/f;->c(I)V

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v2, v2, Lo/e;->e:Lp/l;

    iget-object v2, v2, Lp/m;->h:Lp/f;

    invoke-virtual {v2, v15}, Lp/f;->c(I)V

    invoke-virtual {v0}, Lp/e;->g()V

    const/4 v2, 0x2

    if-eq v7, v2, :cond_28

    if-ne v13, v2, :cond_27

    goto :goto_19

    :cond_27
    move-object/from16 v21, v4

    move-object/from16 v22, v5

    goto :goto_1b

    :cond_28
    :goto_19
    if-eqz v12, :cond_2a

    iget-object v2, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lp/m;

    invoke-virtual/range {v21 .. v21}, Lp/m;->k()Z

    move-result v21

    if-nez v21, :cond_29

    const/4 v12, 0x0

    :cond_2a
    if-eqz v12, :cond_2b

    const/4 v2, 0x2

    if-ne v7, v2, :cond_2b

    iget-object v2, v0, Lp/e;->a:Lo/f;

    move-object/from16 v21, v4

    .line 37
    iget-object v4, v2, Lo/e;->J:[I

    move-object/from16 v22, v5

    const/4 v5, 0x0

    const/16 v17, 0x1

    aput v17, v4, v5

    .line 38
    invoke-virtual {v0, v2, v5}, Lp/e;->d(Lo/f;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lo/e;->B(I)V

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v4, v2, Lo/e;->d:Lp/j;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    invoke-virtual {v2}, Lo/e;->o()I

    move-result v2

    invoke-virtual {v4, v2}, Lp/g;->c(I)V

    goto :goto_1a

    :cond_2b
    move-object/from16 v21, v4

    move-object/from16 v22, v5

    :goto_1a
    if-eqz v12, :cond_2c

    const/4 v2, 0x2

    if-ne v13, v2, :cond_2c

    iget-object v2, v0, Lp/e;->a:Lo/f;

    .line 39
    iget-object v4, v2, Lo/e;->J:[I

    const/4 v5, 0x1

    aput v5, v4, v5

    .line 40
    invoke-virtual {v0, v2, v5}, Lp/e;->d(Lo/f;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lo/e;->w(I)V

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v4, v2, Lo/e;->e:Lp/l;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    invoke-virtual {v2}, Lo/e;->i()I

    move-result v2

    invoke-virtual {v4, v2}, Lp/g;->c(I)V

    :cond_2c
    :goto_1b
    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v4, v2, Lo/e;->J:[I

    const/4 v5, 0x0

    aget v12, v4, v5

    move/from16 v23, v9

    const/4 v9, 0x1

    if-eq v12, v9, :cond_2e

    aget v4, v4, v5

    const/4 v5, 0x4

    if-ne v4, v5, :cond_2d

    goto :goto_1c

    :cond_2d
    const/4 v2, 0x0

    goto :goto_1d

    :cond_2e
    :goto_1c
    invoke-virtual {v2}, Lo/e;->o()I

    move-result v2

    add-int/2addr v2, v14

    iget-object v4, v0, Lp/e;->a:Lo/f;

    iget-object v4, v4, Lo/e;->d:Lp/j;

    iget-object v4, v4, Lp/m;->i:Lp/f;

    invoke-virtual {v4, v2}, Lp/f;->c(I)V

    iget-object v4, v0, Lp/e;->a:Lo/f;

    iget-object v4, v4, Lo/e;->d:Lp/j;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    sub-int/2addr v2, v14

    invoke-virtual {v4, v2}, Lp/g;->c(I)V

    invoke-virtual {v0}, Lp/e;->g()V

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v4, v2, Lo/e;->J:[I

    const/4 v5, 0x1

    aget v9, v4, v5

    if-eq v9, v5, :cond_2f

    aget v4, v4, v5

    const/4 v5, 0x4

    if-ne v4, v5, :cond_30

    :cond_2f
    invoke-virtual {v2}, Lo/e;->i()I

    move-result v2

    add-int/2addr v2, v15

    iget-object v4, v0, Lp/e;->a:Lo/f;

    iget-object v4, v4, Lo/e;->e:Lp/l;

    iget-object v4, v4, Lp/m;->i:Lp/f;

    invoke-virtual {v4, v2}, Lp/f;->c(I)V

    iget-object v4, v0, Lp/e;->a:Lo/f;

    iget-object v4, v4, Lo/e;->e:Lp/l;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    sub-int/2addr v2, v15

    invoke-virtual {v4, v2}, Lp/g;->c(I)V

    :cond_30
    invoke-virtual {v0}, Lp/e;->g()V

    const/4 v2, 0x1

    :goto_1d
    iget-object v4, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_32

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp/m;

    iget-object v9, v5, Lp/m;->b:Lo/e;

    iget-object v12, v0, Lp/e;->a:Lo/f;

    if-ne v9, v12, :cond_31

    iget-boolean v9, v5, Lp/m;->g:Z

    if-nez v9, :cond_31

    goto :goto_1e

    :cond_31
    invoke-virtual {v5}, Lp/m;->e()V

    goto :goto_1e

    :cond_32
    iget-object v4, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_33
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_37

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp/m;

    if-nez v2, :cond_34

    iget-object v9, v5, Lp/m;->b:Lo/e;

    iget-object v12, v0, Lp/e;->a:Lo/f;

    if-ne v9, v12, :cond_34

    goto :goto_1f

    :cond_34
    iget-object v9, v5, Lp/m;->h:Lp/f;

    iget-boolean v9, v9, Lp/f;->j:Z

    if-nez v9, :cond_35

    goto :goto_20

    :cond_35
    iget-object v9, v5, Lp/m;->i:Lp/f;

    iget-boolean v9, v9, Lp/f;->j:Z

    if-nez v9, :cond_36

    instance-of v9, v5, Lp/h;

    if-nez v9, :cond_36

    goto :goto_20

    :cond_36
    iget-object v9, v5, Lp/m;->e:Lp/g;

    iget-boolean v9, v9, Lp/f;->j:Z

    if-nez v9, :cond_33

    instance-of v9, v5, Lp/c;

    if-nez v9, :cond_33

    instance-of v5, v5, Lp/h;

    if-nez v5, :cond_33

    :goto_20
    const/4 v2, 0x0

    goto :goto_21

    :cond_37
    const/4 v2, 0x1

    :goto_21
    iget-object v4, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v4, v7}, Lo/e;->x(I)V

    iget-object v0, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v0, v13}, Lo/e;->A(I)V

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v4, 0x2

    goto/16 :goto_25

    :cond_38
    move-object/from16 v20, v2

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move/from16 v23, v9

    .line 41
    iget-object v0, v3, Lo/f;->g0:Lp/e;

    .line 42
    iget-boolean v2, v0, Lp/e;->b:Z

    if-eqz v2, :cond_3a

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v2, v2, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/e;

    const/4 v5, 0x0

    iput-boolean v5, v4, Lo/e;->a:Z

    iget-object v7, v4, Lo/e;->d:Lp/j;

    iget-object v9, v7, Lp/m;->e:Lp/g;

    iput-boolean v5, v9, Lp/f;->j:Z

    iput-boolean v5, v7, Lp/m;->g:Z

    invoke-virtual {v7}, Lp/j;->n()V

    iget-object v4, v4, Lo/e;->e:Lp/l;

    iget-object v7, v4, Lp/m;->e:Lp/g;

    iput-boolean v5, v7, Lp/f;->j:Z

    iput-boolean v5, v4, Lp/m;->g:Z

    invoke-virtual {v4}, Lp/l;->m()V

    goto :goto_22

    :cond_39
    const/4 v5, 0x0

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iput-boolean v5, v2, Lo/e;->a:Z

    iget-object v2, v2, Lo/e;->d:Lp/j;

    iget-object v4, v2, Lp/m;->e:Lp/g;

    iput-boolean v5, v4, Lp/f;->j:Z

    iput-boolean v5, v2, Lp/m;->g:Z

    invoke-virtual {v2}, Lp/j;->n()V

    iget-object v2, v0, Lp/e;->a:Lo/f;

    iget-object v2, v2, Lo/e;->e:Lp/l;

    iget-object v4, v2, Lp/m;->e:Lp/g;

    iput-boolean v5, v4, Lp/f;->j:Z

    iput-boolean v5, v2, Lp/m;->g:Z

    invoke-virtual {v2}, Lp/l;->m()V

    invoke-virtual {v0}, Lp/e;->c()V

    goto :goto_23

    :cond_3a
    const/4 v5, 0x0

    :goto_23
    iget-object v2, v0, Lp/e;->d:Lo/f;

    invoke-virtual {v0, v2}, Lp/e;->b(Lo/f;)Z

    iget-object v2, v0, Lp/e;->a:Lo/f;

    .line 43
    iput v5, v2, Lo/e;->P:I

    .line 44
    iput v5, v2, Lo/e;->Q:I

    .line 45
    iget-object v2, v2, Lo/e;->d:Lp/j;

    iget-object v2, v2, Lp/m;->h:Lp/f;

    invoke-virtual {v2, v5}, Lp/f;->c(I)V

    iget-object v0, v0, Lp/e;->a:Lo/f;

    iget-object v0, v0, Lo/e;->e:Lp/l;

    iget-object v0, v0, Lp/m;->h:Lp/f;

    invoke-virtual {v0, v5}, Lp/f;->c(I)V

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v8, v0, :cond_3b

    .line 46
    invoke-virtual {v3, v12, v5}, Lo/f;->H(ZI)Z

    move-result v2

    const/4 v4, 0x1

    and-int/lit8 v19, v2, 0x1

    move v2, v4

    move/from16 v5, v19

    goto :goto_24

    :cond_3b
    const/4 v4, 0x1

    move v5, v4

    const/4 v2, 0x0

    :goto_24
    if-ne v10, v0, :cond_3c

    invoke-virtual {v3, v12, v4}, Lo/f;->H(ZI)Z

    move-result v7

    and-int v4, v5, v7

    add-int/lit8 v2, v2, 0x1

    move/from16 v24, v4

    move v4, v2

    move/from16 v2, v24

    goto :goto_25

    :cond_3c
    move v4, v2

    move v2, v5

    :goto_25
    if-eqz v2, :cond_40

    if-ne v8, v0, :cond_3d

    const/4 v5, 0x1

    goto :goto_26

    :cond_3d
    const/4 v5, 0x0

    :goto_26
    if-ne v10, v0, :cond_3e

    const/4 v0, 0x1

    goto :goto_27

    :cond_3e
    const/4 v0, 0x0

    :goto_27
    invoke-virtual {v3, v5, v0}, Lo/f;->C(ZZ)V

    goto :goto_28

    :cond_3f
    move-object/from16 v20, v2

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move/from16 v23, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    :cond_40
    :goto_28
    if-eqz v2, :cond_42

    const/4 v0, 0x2

    if-eq v4, v0, :cond_41

    goto :goto_2a

    :cond_41
    :goto_29
    move-object/from16 v0, p0

    goto/16 :goto_42

    :cond_42
    :goto_2a
    const/16 v0, 0x8

    if-lez v6, :cond_4d

    .line 47
    iget-object v2, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 48
    iget-object v4, v3, Lo/f;->h0:Lp/b$b;

    const/4 v5, 0x0

    :goto_2b
    if-ge v5, v2, :cond_47

    .line 49
    iget-object v7, v3, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/e;

    instance-of v8, v7, Lo/g;

    if-eqz v8, :cond_43

    :goto_2c
    const/4 v12, 0x3

    goto :goto_2e

    :cond_43
    iget-object v8, v7, Lo/e;->d:Lp/j;

    iget-object v8, v8, Lp/m;->e:Lp/g;

    iget-boolean v8, v8, Lp/f;->j:Z

    if-eqz v8, :cond_44

    iget-object v8, v7, Lo/e;->e:Lp/l;

    iget-object v8, v8, Lp/m;->e:Lp/g;

    iget-boolean v8, v8, Lp/f;->j:Z

    if-eqz v8, :cond_44

    goto :goto_2c

    :cond_44
    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Lo/e;->h(I)I

    move-result v9

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lo/e;->h(I)I

    move-result v10

    const/4 v12, 0x3

    if-ne v9, v12, :cond_45

    iget v9, v7, Lo/e;->j:I

    if-eq v9, v8, :cond_45

    if-ne v10, v12, :cond_45

    iget v9, v7, Lo/e;->k:I

    if-eq v9, v8, :cond_45

    const/4 v8, 0x1

    goto :goto_2d

    :cond_45
    const/4 v8, 0x0

    :goto_2d
    if-eqz v8, :cond_46

    goto :goto_2e

    :cond_46
    const/4 v8, 0x0

    invoke-virtual {v1, v4, v7, v8}, Lp/b;->a(Lp/b$b;Lo/e;Z)Z

    :goto_2e
    add-int/lit8 v5, v5, 0x1

    goto :goto_2b

    :cond_47
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 50
    iget-object v2, v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v5, 0x0

    :goto_2f
    if-ge v5, v2, :cond_4c

    iget-object v7, v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    instance-of v8, v7, Landroidx/constraintlayout/widget/f;

    if-eqz v8, :cond_4b

    check-cast v7, Landroidx/constraintlayout/widget/f;

    .line 51
    iget-object v8, v7, Landroidx/constraintlayout/widget/f;->c:Landroid/view/View;

    if-nez v8, :cond_48

    goto :goto_30

    :cond_48
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v7, v7, Landroidx/constraintlayout/widget/f;->c:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v9, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    const/4 v10, 0x0

    .line 52
    iput v10, v9, Lo/e;->X:I

    .line 53
    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    invoke-virtual {v9}, Lo/e;->j()I

    move-result v9

    const/4 v10, 0x1

    if-eq v9, v10, :cond_49

    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    iget-object v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    invoke-virtual {v12}, Lo/e;->o()I

    move-result v12

    invoke-virtual {v9, v12}, Lo/e;->B(I)V

    :cond_49
    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    invoke-virtual {v9}, Lo/e;->n()I

    move-result v9

    if-eq v9, v10, :cond_4a

    iget-object v8, v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    iget-object v9, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    invoke-virtual {v9}, Lo/e;->i()I

    move-result v9

    invoke-virtual {v8, v9}, Lo/e;->w(I)V

    :cond_4a
    iget-object v7, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    .line 54
    iput v0, v7, Lo/e;->X:I

    :cond_4b
    :goto_30
    add-int/lit8 v5, v5, 0x1

    goto :goto_2f

    .line 55
    :cond_4c
    iget-object v2, v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 57
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4d

    const/4 v5, 0x0

    :goto_31
    if-ge v5, v2, :cond_4d

    iget-object v7, v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 58
    iget-object v7, v7, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 59
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/b;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_31

    .line 60
    :cond_4d
    iget v2, v3, Lo/f;->q0:I

    .line 61
    iget-object v4, v1, Lp/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move/from16 v5, v23

    if-lez v6, :cond_4e

    invoke-virtual {v1, v3, v5, v11}, Lp/b;->b(Lo/f;II)V

    :cond_4e
    if-lez v4, :cond_68

    invoke-virtual {v3}, Lo/e;->j()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_4f

    const/4 v6, 0x1

    goto :goto_32

    :cond_4f
    const/4 v6, 0x0

    :goto_32
    invoke-virtual {v3}, Lo/e;->n()I

    move-result v8

    if-ne v8, v7, :cond_50

    const/4 v7, 0x1

    goto :goto_33

    :cond_50
    const/4 v7, 0x0

    :goto_33
    invoke-virtual {v3}, Lo/e;->o()I

    move-result v8

    iget-object v9, v1, Lp/b;->c:Lo/f;

    .line 62
    iget v9, v9, Lo/e;->S:I

    .line 63
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual {v3}, Lo/e;->i()I

    move-result v9

    iget-object v10, v1, Lp/b;->c:Lo/f;

    .line 64
    iget v10, v10, Lo/e;->T:I

    .line 65
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    move v10, v8

    move v12, v9

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_34
    if-ge v8, v4, :cond_56

    iget-object v13, v1, Lp/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo/e;

    instance-of v14, v13, Lo/k;

    if-nez v14, :cond_51

    move/from16 v16, v2

    move-object/from16 v15, v20

    move-object/from16 v14, v21

    move-object/from16 v0, v22

    goto/16 :goto_39

    :cond_51
    invoke-virtual {v13}, Lo/e;->o()I

    move-result v14

    invoke-virtual {v13}, Lo/e;->i()I

    move-result v15

    move/from16 v16, v2

    move-object/from16 v0, v22

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v13, v2}, Lp/b;->a(Lp/b$b;Lo/e;Z)Z

    move-result v18

    or-int v2, v9, v18

    invoke-virtual {v13}, Lo/e;->o()I

    move-result v9

    move/from16 v18, v2

    invoke-virtual {v13}, Lo/e;->i()I

    move-result v2

    if-eq v9, v14, :cond_53

    invoke-virtual {v13, v9}, Lo/e;->B(I)V

    if-eqz v6, :cond_52

    invoke-virtual {v13}, Lo/e;->m()I

    move-result v9

    if-le v9, v10, :cond_52

    invoke-virtual {v13}, Lo/e;->m()I

    move-result v9

    move-object/from16 v14, v21

    invoke-virtual {v13, v14}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lo/d;->b()I

    move-result v18

    add-int v9, v18, v9

    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_35

    :cond_52
    move-object/from16 v14, v21

    :goto_35
    const/16 v18, 0x1

    goto :goto_36

    :cond_53
    move-object/from16 v14, v21

    :goto_36
    if-eq v2, v15, :cond_55

    invoke-virtual {v13, v2}, Lo/e;->w(I)V

    if-eqz v7, :cond_54

    invoke-virtual {v13}, Lo/e;->g()I

    move-result v2

    if-le v2, v12, :cond_54

    invoke-virtual {v13}, Lo/e;->g()I

    move-result v2

    move-object/from16 v15, v20

    invoke-virtual {v13, v15}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v9

    invoke-virtual {v9}, Lo/d;->b()I

    move-result v9

    add-int/2addr v9, v2

    invoke-static {v12, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v12, v2

    goto :goto_37

    :cond_54
    move-object/from16 v15, v20

    :goto_37
    const/16 v18, 0x1

    goto :goto_38

    :cond_55
    move-object/from16 v15, v20

    :goto_38
    check-cast v13, Lo/k;

    const/4 v2, 0x0

    or-int/lit8 v9, v18, 0x0

    :goto_39
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v22, v0

    move-object/from16 v21, v14

    move-object/from16 v20, v15

    move/from16 v2, v16

    const/16 v0, 0x8

    goto/16 :goto_34

    :cond_56
    move/from16 v16, v2

    move-object/from16 v15, v20

    move-object/from16 v14, v21

    move-object/from16 v0, v22

    const/4 v2, 0x0

    const/4 v8, 0x2

    :goto_3a
    if-ge v2, v8, :cond_64

    move v13, v12

    move v12, v10

    move v10, v9

    const/4 v9, 0x0

    :goto_3b
    if-ge v9, v4, :cond_62

    iget-object v8, v1, Lp/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/e;

    move/from16 v18, v4

    instance-of v4, v8, Lo/h;

    if-eqz v4, :cond_57

    instance-of v4, v8, Lo/k;

    if-eqz v4, :cond_58

    :cond_57
    instance-of v4, v8, Lo/g;

    if-eqz v4, :cond_59

    :cond_58
    move/from16 v20, v2

    const/16 v2, 0x8

    goto :goto_3c

    .line 66
    :cond_59
    iget v4, v8, Lo/e;->X:I

    move/from16 v20, v2

    const/16 v2, 0x8

    if-ne v4, v2, :cond_5a

    goto :goto_3c

    .line 67
    :cond_5a
    iget-object v4, v8, Lo/e;->d:Lp/j;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    iget-boolean v4, v4, Lp/f;->j:Z

    if-eqz v4, :cond_5b

    iget-object v4, v8, Lo/e;->e:Lp/l;

    iget-object v4, v4, Lp/m;->e:Lp/g;

    iget-boolean v4, v4, Lp/f;->j:Z

    if-eqz v4, :cond_5b

    goto :goto_3c

    :cond_5b
    instance-of v4, v8, Lo/k;

    if-eqz v4, :cond_5c

    :goto_3c
    move-object/from16 v22, v0

    move-object/from16 v21, v3

    move/from16 v23, v5

    goto :goto_3d

    :cond_5c
    invoke-virtual {v8}, Lo/e;->o()I

    move-result v4

    invoke-virtual {v8}, Lo/e;->i()I

    move-result v2

    move-object/from16 v21, v3

    .line 68
    iget v3, v8, Lo/e;->R:I

    move/from16 v23, v5

    const/4 v5, 0x1

    .line 69
    invoke-virtual {v1, v0, v8, v5}, Lp/b;->a(Lp/b$b;Lo/e;Z)Z

    move-result v19

    or-int v10, v10, v19

    invoke-virtual {v8}, Lo/e;->o()I

    move-result v5

    move-object/from16 v22, v0

    invoke-virtual {v8}, Lo/e;->i()I

    move-result v0

    if-eq v5, v4, :cond_5e

    invoke-virtual {v8, v5}, Lo/e;->B(I)V

    if-eqz v6, :cond_5d

    invoke-virtual {v8}, Lo/e;->m()I

    move-result v4

    if-le v4, v12, :cond_5d

    invoke-virtual {v8}, Lo/e;->m()I

    move-result v4

    invoke-virtual {v8, v14}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v5

    invoke-virtual {v5}, Lo/d;->b()I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_5d
    const/4 v10, 0x1

    :cond_5e
    if-eq v0, v2, :cond_60

    invoke-virtual {v8, v0}, Lo/e;->w(I)V

    if-eqz v7, :cond_5f

    invoke-virtual {v8}, Lo/e;->g()I

    move-result v0

    if-le v0, v13, :cond_5f

    invoke-virtual {v8}, Lo/e;->g()I

    move-result v0

    invoke-virtual {v8, v15}, Lo/e;->f(Lo/d$a;)Lo/d;

    move-result-object v2

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v13, v0

    :cond_5f
    const/4 v10, 0x1

    .line 70
    :cond_60
    iget-boolean v0, v8, Lo/e;->w:Z

    if-eqz v0, :cond_61

    .line 71
    iget v0, v8, Lo/e;->R:I

    if-eq v3, v0, :cond_61

    const/4 v10, 0x1

    :cond_61
    :goto_3d
    add-int/lit8 v9, v9, 0x1

    move/from16 v4, v18

    move/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v0, v22

    move/from16 v5, v23

    const/4 v8, 0x2

    goto/16 :goto_3b

    :cond_62
    move-object/from16 v22, v0

    move/from16 v20, v2

    move-object/from16 v21, v3

    move/from16 v18, v4

    move/from16 v23, v5

    if-eqz v10, :cond_63

    move-object/from16 v0, v21

    move/from16 v2, v23

    .line 72
    invoke-virtual {v1, v0, v2, v11}, Lp/b;->b(Lo/f;II)V

    const/4 v9, 0x0

    goto :goto_3e

    :cond_63
    move-object/from16 v0, v21

    move/from16 v2, v23

    move v9, v10

    :goto_3e
    add-int/lit8 v3, v20, 0x1

    move v5, v2

    move v2, v3

    move v10, v12

    move v12, v13

    move/from16 v4, v18

    const/4 v8, 0x2

    move-object v3, v0

    move-object/from16 v0, v22

    goto/16 :goto_3a

    :cond_64
    move-object v0, v3

    move v2, v5

    if-eqz v9, :cond_67

    invoke-virtual {v1, v0, v2, v11}, Lp/b;->b(Lo/f;II)V

    invoke-virtual {v0}, Lo/e;->o()I

    move-result v3

    if-ge v3, v10, :cond_65

    invoke-virtual {v0, v10}, Lo/e;->B(I)V

    const/4 v6, 0x1

    goto :goto_3f

    :cond_65
    const/4 v6, 0x0

    :goto_3f
    invoke-virtual {v0}, Lo/e;->i()I

    move-result v3

    if-ge v3, v12, :cond_66

    invoke-virtual {v0, v12}, Lo/e;->w(I)V

    const/4 v4, 0x1

    goto :goto_40

    :cond_66
    move v4, v6

    :goto_40
    if-eqz v4, :cond_67

    invoke-virtual {v1, v0, v2, v11}, Lp/b;->b(Lo/f;II)V

    :cond_67
    move/from16 v1, v16

    goto :goto_41

    :cond_68
    move-object v0, v3

    move v1, v2

    :goto_41
    invoke-virtual {v0, v1}, Lo/f;->J(I)V

    goto/16 :goto_29

    .line 73
    :goto_42
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-virtual {v1}, Lo/e;->o()I

    move-result v1

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    invoke-virtual {v2}, Lo/e;->i()I

    move-result v2

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 74
    iget-boolean v4, v3, Lo/f;->r0:Z

    .line 75
    iget-boolean v3, v3, Lo/f;->s0:Z

    .line 76
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget v6, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iget v5, v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    add-int/2addr v1, v5

    add-int/2addr v2, v6

    move/from16 v5, p1

    const/4 v6, 0x0

    invoke-static {v1, v5, v6}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v1

    move/from16 v5, p2

    invoke-static {v2, v5, v6}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v2

    const v5, 0xffffff

    and-int/2addr v1, v5

    and-int/2addr v2, v5

    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v5, 0x1000000

    if-eqz v4, :cond_69

    or-int/2addr v1, v5

    :cond_69
    if-eqz v3, :cond_6a

    or-int/2addr v2, v5

    :cond_6a
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v0

    instance-of v1, p1, Landroidx/constraintlayout/widget/e;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lo/g;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    new-instance v1, Lo/g;

    invoke-direct {v1}, Lo/g;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Lo/e;

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    check-cast v1, Lo/g;

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    invoke-virtual {v1, v0}, Lo/g;->E(I)V

    :cond_0
    instance-of v0, p1, Landroidx/constraintlayout/widget/b;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/constraintlayout/widget/b;

    invoke-virtual {v0}, Landroidx/constraintlayout/widget/b;->g()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Landroid/view/View;)Lo/e;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 1
    iget-object v1, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 2
    iput-object v1, v0, Lo/e;->K:Lo/e;

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public requestLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    .line 2
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Landroidx/constraintlayout/widget/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/c;

    return-void
.end method

.method public setId(I)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Lq/c;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lq/b;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lo/f;

    .line 1
    iput p1, v0, Lo/f;->q0:I

    const/16 v0, 0x100

    invoke-static {p1, v0}, Lo/j;->a(II)Z

    move-result p1

    sput-boolean p1, Ln/d;->p:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
