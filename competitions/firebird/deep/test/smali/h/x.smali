.class public Lh/x;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lh/s0;

.field public c:Lh/s0;

.field public d:Lh/s0;

.field public e:Lh/s0;

.field public f:Lh/s0;

.field public g:Lh/s0;

.field public h:Lh/s0;

.field public final i:Lh/z;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh/x;->j:I

    const/4 v0, -0x1

    iput v0, p0, Lh/x;->k:I

    iput-object p1, p0, Lh/x;->a:Landroid/widget/TextView;

    new-instance v0, Lh/z;

    invoke-direct {v0, p1}, Lh/z;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lh/x;->i:Lh/z;

    return-void
.end method

.method public static c(Landroid/content/Context;Lh/i;I)Lh/s0;
    .locals 0

    invoke-virtual {p1, p0, p2}, Lh/i;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lh/s0;

    invoke-direct {p1}, Lh/s0;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Lh/s0;->d:Z

    iput-object p0, p1, Lh/s0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Lh/s0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Lh/i;->f(Landroid/graphics/drawable/Drawable;Lh/s0;[I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Lh/x;->b:Lh/s0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/x;->c:Lh/s0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/x;->d:Lh/s0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/x;->e:Lh/s0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Lh/x;->b:Lh/s0;

    invoke-virtual {p0, v3, v4}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Lh/x;->c:Lh/s0;

    invoke-virtual {p0, v3, v4}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Lh/x;->d:Lh/s0;

    invoke-virtual {p0, v3, v4}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Lh/x;->e:Lh/s0;

    invoke-virtual {p0, v0, v3}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    :cond_1
    iget-object v0, p0, Lh/x;->f:Lh/s0;

    if-nez v0, :cond_2

    iget-object v0, p0, Lh/x;->g:Lh/s0;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Lh/x;->f:Lh/s0;

    invoke-virtual {p0, v2, v3}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Lh/x;->g:Lh/s0;

    invoke-virtual {p0, v0, v1}, Lh/x;->a(Landroid/graphics/drawable/Drawable;Lh/s0;)V

    :cond_3
    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lh/x;->i:Lh/z;

    .line 1
    invoke-virtual {v0}, Lh/z;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v0, v0, Lh/z;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 22
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Lh/i;->a()Lh/i;

    move-result-object v11

    sget-object v3, Lb/b;->h:[I

    const/4 v12, 0x0

    invoke-static {v10, v8, v3, v9, v12}, Lh/u0;->o(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lh/u0;

    move-result-object v13

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1
    iget-object v5, v13, Lh/u0;->b:Landroid/content/res/TypedArray;

    const/4 v7, 0x0

    move-object/from16 v4, p1

    move/from16 v6, p2

    .line 2
    invoke-static/range {v1 .. v7}, Le0/m;->e(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    const/4 v14, -0x1

    invoke-virtual {v13, v12, v14}, Lh/u0;->j(II)I

    move-result v1

    const/4 v15, 0x3

    invoke-virtual {v13, v15}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v13, v15, v12}, Lh/u0;->j(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v2

    iput-object v2, v0, Lh/x;->b:Lh/s0;

    :cond_0
    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v13, v7, v12}, Lh/u0;->j(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v2

    iput-object v2, v0, Lh/x;->c:Lh/s0;

    :cond_1
    const/4 v6, 0x4

    invoke-virtual {v13, v6}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v13, v6, v12}, Lh/u0;->j(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v2

    iput-object v2, v0, Lh/x;->d:Lh/s0;

    :cond_2
    const/4 v5, 0x2

    invoke-virtual {v13, v5}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v13, v5, v12}, Lh/u0;->j(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v2

    iput-object v2, v0, Lh/x;->e:Lh/s0;

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x5

    invoke-virtual {v13, v4}, Lh/u0;->m(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v13, v4, v12}, Lh/u0;->j(II)I

    move-result v3

    invoke-static {v10, v11, v3}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v3

    iput-object v3, v0, Lh/x;->f:Lh/s0;

    :cond_4
    const/4 v3, 0x6

    invoke-virtual {v13, v3}, Lh/u0;->m(I)Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-virtual {v13, v3, v12}, Lh/u0;->j(II)I

    move-result v4

    invoke-static {v10, v11, v4}, Lh/x;->c(Landroid/content/Context;Lh/i;I)Lh/s0;

    move-result-object v4

    iput-object v4, v0, Lh/x;->g:Lh/s0;

    .line 3
    :cond_5
    iget-object v4, v13, Lh/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    iget-object v4, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v4

    instance-of v4, v4, Landroid/text/method/PasswordTransformationMethod;

    const/16 v13, 0x1a

    const/16 v3, 0xf

    const/16 v15, 0xe

    if-eq v1, v14, :cond_9

    sget-object v5, Lb/b;->w:[I

    .line 5
    new-instance v6, Lh/u0;

    invoke-virtual {v10, v1, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-direct {v6, v10, v1}, Lh/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v4, :cond_6

    .line 6
    invoke-virtual {v6, v15}, Lh/u0;->m(I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v6, v15, v12}, Lh/u0;->a(IZ)Z

    move-result v5

    const/16 v19, 0x1

    goto :goto_0

    :cond_6
    move v5, v12

    move/from16 v19, v5

    :goto_0
    invoke-virtual {v0, v10, v6}, Lh/x;->l(Landroid/content/Context;Lh/u0;)V

    invoke-virtual {v6, v3}, Lh/u0;->m(I)Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-virtual {v6, v3}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object v20

    goto :goto_1

    :cond_7
    const/16 v20, 0x0

    :goto_1
    if-lt v2, v13, :cond_8

    const/16 v7, 0xd

    invoke-virtual {v6, v7}, Lh/u0;->m(I)Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-virtual {v6, v7}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_8
    const/4 v6, 0x0

    .line 7
    :goto_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_3

    :cond_9
    move v5, v12

    move/from16 v19, v5

    const/4 v6, 0x0

    const/16 v20, 0x0

    .line 8
    :goto_3
    sget-object v1, Lb/b;->w:[I

    .line 9
    new-instance v7, Lh/u0;

    invoke-virtual {v10, v8, v1, v9, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-direct {v7, v10, v1}, Lh/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v4, :cond_a

    .line 10
    invoke-virtual {v7, v15}, Lh/u0;->m(I)Z

    move-result v21

    if-eqz v21, :cond_a

    invoke-virtual {v7, v15, v12}, Lh/u0;->a(IZ)Z

    move-result v5

    const/16 v19, 0x1

    :cond_a
    invoke-virtual {v7, v3}, Lh/u0;->m(I)Z

    move-result v21

    if-eqz v21, :cond_b

    invoke-virtual {v7, v3}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object v20

    :cond_b
    if-lt v2, v13, :cond_c

    const/16 v13, 0xd

    invoke-virtual {v7, v13}, Lh/u0;->m(I)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v7, v13}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_c
    const/16 v13, 0xd

    :cond_d
    :goto_4
    const/16 v3, 0x1c

    if-lt v2, v3, :cond_e

    invoke-virtual {v7, v12}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v7, v12, v14}, Lh/u0;->d(II)I

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, v0, Lh/x;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v12, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_e
    invoke-virtual {v0, v10, v7}, Lh/x;->l(Landroid/content/Context;Lh/u0;)V

    .line 11
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v4, :cond_f

    if-eqz v19, :cond_f

    .line 12
    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 13
    :cond_f
    iget-object v1, v0, Lh/x;->l:Landroid/graphics/Typeface;

    if-eqz v1, :cond_11

    iget v2, v0, Lh/x;->k:I

    if-ne v2, v14, :cond_10

    iget-object v2, v0, Lh/x;->a:Landroid/widget/TextView;

    iget v3, v0, Lh/x;->j:I

    invoke-virtual {v2, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_5

    :cond_10
    iget-object v2, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_11
    :goto_5
    if-eqz v6, :cond_12

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_12
    if-eqz v20, :cond_13

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-static/range {v20 .. v20}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_13
    iget-object v7, v0, Lh/x;->i:Lh/z;

    .line 14
    iget-object v1, v7, Lh/z;->j:Landroid/content/Context;

    sget-object v3, Lb/b;->i:[I

    invoke-virtual {v1, v8, v3, v9, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    iget-object v1, v7, Lh/z;->i:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v18, 0x0

    const/4 v5, 0x6

    const/4 v13, 0x5

    move-object/from16 v4, p1

    const/4 v15, 0x2

    move-object v5, v6

    move-object v14, v6

    const/4 v15, 0x4

    move/from16 v6, p2

    move-object v9, v7

    move/from16 v7, v18

    invoke-static/range {v1 .. v7}, Le0/m;->e(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    invoke-virtual {v14, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v14, v13, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, v9, Lh/z;->a:I

    :cond_14
    invoke-virtual {v14, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz v1, :cond_15

    invoke-virtual {v14, v15, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    goto :goto_6

    :cond_15
    move v1, v2

    :goto_6
    const/4 v3, 0x2

    invoke-virtual {v14, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v14, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    goto :goto_7

    :cond_16
    move v4, v2

    :goto_7
    const/4 v3, 0x1

    invoke-virtual {v14, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-virtual {v14, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    goto :goto_8

    :cond_17
    move v5, v2

    :goto_8
    const/4 v6, 0x3

    invoke-virtual {v14, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v14, v6, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    if-lez v7, :cond_1a

    invoke-virtual {v14}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 15
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->length()I

    move-result v7

    new-array v13, v7, [I

    if-lez v7, :cond_19

    move v15, v12

    :goto_9
    if-ge v15, v7, :cond_18

    const/4 v12, -0x1

    invoke-virtual {v6, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v17

    aput v17, v13, v15

    add-int/lit8 v15, v15, 0x1

    const/4 v12, 0x0

    goto :goto_9

    :cond_18
    invoke-virtual {v9, v13}, Lh/z;->b([I)[I

    move-result-object v7

    iput-object v7, v9, Lh/z;->f:[I

    invoke-virtual {v9}, Lh/z;->h()Z

    .line 16
    :cond_19
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1a
    invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v9}, Lh/z;->i()Z

    move-result v6

    if-eqz v6, :cond_1f

    iget v6, v9, Lh/z;->a:I

    if-ne v6, v3, :cond_20

    iget-boolean v6, v9, Lh/z;->g:Z

    if-nez v6, :cond_1e

    iget-object v6, v9, Lh/z;->j:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    cmpl-float v7, v4, v2

    if-nez v7, :cond_1b

    const/high16 v4, 0x41400000    # 12.0f

    const/4 v7, 0x2

    invoke-static {v7, v4, v6}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    goto :goto_a

    :cond_1b
    const/4 v7, 0x2

    :goto_a
    cmpl-float v12, v5, v2

    if-nez v12, :cond_1c

    const/high16 v5, 0x42e00000    # 112.0f

    invoke-static {v7, v5, v6}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    :cond_1c
    cmpl-float v6, v1, v2

    if-nez v6, :cond_1d

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_1d
    invoke-virtual {v9, v4, v5, v1}, Lh/z;->j(FFF)V

    :cond_1e
    invoke-virtual {v9}, Lh/z;->g()Z

    goto :goto_b

    :cond_1f
    const/4 v1, 0x0

    iput v1, v9, Lh/z;->a:I

    .line 17
    :cond_20
    :goto_b
    sget-boolean v1, Lg0/b;->a:Z

    if-eqz v1, :cond_22

    iget-object v1, v0, Lh/x;->i:Lh/z;

    .line 18
    iget v4, v1, Lh/z;->a:I

    if-eqz v4, :cond_22

    .line 19
    iget-object v1, v1, Lh/z;->f:[I

    .line 20
    array-length v4, v1

    if-lez v4, :cond_22

    iget-object v4, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_21

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    iget-object v2, v0, Lh/x;->i:Lh/z;

    .line 21
    iget v2, v2, Lh/z;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 22
    iget-object v4, v0, Lh/x;->i:Lh/z;

    .line 23
    iget v4, v4, Lh/z;->e:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 24
    iget-object v5, v0, Lh/x;->i:Lh/z;

    .line 25
    iget v5, v5, Lh/z;->c:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const/4 v6, 0x0

    .line 26
    invoke-virtual {v1, v2, v4, v5, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_c

    :cond_21
    const/4 v6, 0x0

    iget-object v2, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    :cond_22
    :goto_c
    sget-object v1, Lb/b;->i:[I

    .line 27
    invoke-virtual {v10, v8, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v4, -0x1

    .line 28
    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v4, :cond_23

    .line 29
    invoke-virtual {v11, v10, v2}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    const/16 v2, 0xd

    goto :goto_d

    :cond_23
    const/16 v2, 0xd

    const/4 v7, 0x0

    .line 30
    :goto_d
    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v4, :cond_24

    .line 31
    invoke-virtual {v11, v10, v2}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_e

    :cond_24
    const/4 v2, 0x0

    :goto_e
    const/16 v5, 0x9

    .line 32
    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eq v5, v4, :cond_25

    .line 33
    invoke-virtual {v11, v10, v5}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_f

    :cond_25
    const/4 v5, 0x0

    :goto_f
    const/4 v6, 0x6

    .line 34
    invoke-virtual {v1, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-eq v6, v4, :cond_26

    .line 35
    invoke-virtual {v11, v10, v6}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    goto :goto_10

    :cond_26
    const/4 v6, 0x0

    :goto_10
    const/16 v8, 0xa

    .line 36
    invoke-virtual {v1, v8, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-eq v8, v4, :cond_27

    .line 37
    invoke-virtual {v11, v10, v8}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_11

    :cond_27
    const/4 v8, 0x0

    :goto_11
    const/4 v9, 0x7

    .line 38
    invoke-virtual {v1, v9, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    if-eq v9, v4, :cond_28

    .line 39
    invoke-virtual {v11, v10, v9}, Lh/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_12

    :cond_28
    const/4 v4, 0x0

    :goto_12
    if-nez v8, :cond_33

    if-eqz v4, :cond_29

    goto :goto_1a

    :cond_29
    if-nez v7, :cond_2a

    if-nez v2, :cond_2a

    if-nez v5, :cond_2a

    if-eqz v6, :cond_38

    .line 40
    :cond_2a
    iget-object v4, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v8, 0x0

    aget-object v9, v4, v8

    if-nez v9, :cond_30

    const/4 v9, 0x2

    aget-object v11, v4, v9

    if-eqz v11, :cond_2b

    goto :goto_17

    :cond_2b
    iget-object v4, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iget-object v9, v0, Lh/x;->a:Landroid/widget/TextView;

    if-eqz v7, :cond_2c

    goto :goto_13

    :cond_2c
    aget-object v7, v4, v8

    :goto_13
    if-eqz v2, :cond_2d

    goto :goto_14

    :cond_2d
    aget-object v2, v4, v3

    :goto_14
    if-eqz v5, :cond_2e

    goto :goto_15

    :cond_2e
    const/4 v3, 0x2

    aget-object v5, v4, v3

    :goto_15
    if-eqz v6, :cond_2f

    goto :goto_16

    :cond_2f
    const/4 v3, 0x3

    aget-object v6, v4, v3

    :goto_16
    invoke-virtual {v9, v7, v2, v5, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1f

    :cond_30
    :goto_17
    iget-object v5, v0, Lh/x;->a:Landroid/widget/TextView;

    const/4 v7, 0x0

    aget-object v8, v4, v7

    if-eqz v2, :cond_31

    goto :goto_18

    :cond_31
    aget-object v2, v4, v3

    :goto_18
    const/4 v3, 0x2

    aget-object v3, v4, v3

    if-eqz v6, :cond_32

    goto :goto_19

    :cond_32
    const/4 v6, 0x3

    aget-object v6, v4, v6

    :goto_19
    invoke-virtual {v5, v8, v2, v3, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1f

    :cond_33
    :goto_1a
    iget-object v5, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iget-object v7, v0, Lh/x;->a:Landroid/widget/TextView;

    if-eqz v8, :cond_34

    goto :goto_1b

    :cond_34
    const/4 v8, 0x0

    aget-object v9, v5, v8

    move-object v8, v9

    :goto_1b
    if-eqz v2, :cond_35

    goto :goto_1c

    :cond_35
    aget-object v2, v5, v3

    :goto_1c
    if-eqz v4, :cond_36

    goto :goto_1d

    :cond_36
    const/4 v3, 0x2

    aget-object v4, v5, v3

    :goto_1d
    if-eqz v6, :cond_37

    goto :goto_1e

    :cond_37
    const/4 v3, 0x3

    aget-object v6, v5, v3

    :goto_1e
    invoke-virtual {v7, v8, v2, v4, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_38
    :goto_1f
    const/16 v2, 0xb

    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3a

    .line 42
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_39

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_39

    sget-object v4, Ld/a;->a:Ljava/lang/ThreadLocal;

    .line 43
    invoke-virtual {v10, v3}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_39

    goto :goto_20

    .line 44
    :cond_39
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 45
    :goto_20
    iget-object v2, v0, Lh/x;->a:Landroid/widget/TextView;

    .line 46
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    :cond_3a
    const/16 v2, 0xc

    .line 48
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3b

    const/4 v3, -0x1

    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v4, 0x0

    .line 50
    invoke-static {v2, v4}, Lh/d0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iget-object v4, v0, Lh/x;->a:Landroid/widget/TextView;

    .line 51
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_21

    :cond_3b
    const/4 v3, -0x1

    :goto_21
    const/16 v2, 0xe

    .line 53
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v4, 0x11

    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    const/16 v5, 0x12

    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 54
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v2, v3, :cond_3c

    .line 55
    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lg0/d;->b(Landroid/widget/TextView;I)V

    :cond_3c
    if-eq v4, v3, :cond_3d

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-static {v1, v4}, Lg0/d;->c(Landroid/widget/TextView;I)V

    :cond_3d
    if-eq v5, v3, :cond_3e

    iget-object v1, v0, Lh/x;->a:Landroid/widget/TextView;

    invoke-static {v1, v5}, Lg0/d;->d(Landroid/widget/TextView;I)V

    :cond_3e
    return-void
.end method

.method public f(Landroid/content/Context;I)V
    .locals 5

    sget-object v0, Lb/b;->w:[I

    .line 1
    new-instance v1, Lh/u0;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lh/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 v0, 0xe

    .line 2
    invoke-virtual {v1, v0}, Lh/u0;->m(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0, v3}, Lh/u0;->a(IZ)Z

    move-result v0

    .line 3
    iget-object v2, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 4
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v3}, Lh/u0;->m(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    invoke-virtual {v1, v3, v2}, Lh/u0;->d(II)I

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lh/x;->a:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, Lh/x;->l(Landroid/content/Context;Lh/u0;)V

    const/16 p1, 0x1a

    if-lt v0, p1, :cond_2

    const/16 p1, 0xd

    invoke-virtual {v1, p1}, Lh/u0;->m(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, p1}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    .line 5
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    iget-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lh/x;->a:Landroid/widget/TextView;

    iget v0, p0, Lh/x;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public g(IIII)V
    .locals 2

    iget-object v0, p0, Lh/x;->i:Lh/z;

    .line 1
    invoke-virtual {v0}, Lh/z;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lh/z;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lh/z;->j(FFF)V

    invoke-virtual {v0}, Lh/z;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lh/z;->a()V

    :cond_0
    return-void
.end method

.method public h([II)V
    .locals 6

    iget-object v0, p0, Lh/x;->i:Lh/z;

    .line 1
    invoke-virtual {v0}, Lh/z;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    new-array v3, v1, [I

    if-nez p2, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v4, v0, Lh/z;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, Lh/z;->b([I)[I

    move-result-object p2

    iput-object p2, v0, Lh/z;->f:[I

    invoke-virtual {v0}, Lh/z;->h()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "None of the preset sizes is valid: "

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-boolean v2, v0, Lh/z;->g:Z

    :goto_2
    invoke-virtual {v0}, Lh/z;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lh/z;->a()V

    :cond_4
    return-void
.end method

.method public i(I)V
    .locals 4

    iget-object v0, p0, Lh/x;->i:Lh/z;

    .line 1
    invoke-virtual {v0}, Lh/z;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Lh/z;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v1, 0x41400000    # 12.0f

    const/4 v2, 0x2

    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p1, v2}, Lh/z;->j(FFF)V

    invoke-virtual {v0}, Lh/z;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lh/z;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown auto-size text type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    .line 2
    iput p1, v0, Lh/z;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lh/z;->d:F

    iput v1, v0, Lh/z;->e:F

    iput v1, v0, Lh/z;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, Lh/z;->f:[I

    iput-boolean p1, v0, Lh/z;->b:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public j(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lh/x;->h:Lh/s0;

    if-nez v0, :cond_0

    new-instance v0, Lh/s0;

    invoke-direct {v0}, Lh/s0;-><init>()V

    iput-object v0, p0, Lh/x;->h:Lh/s0;

    :cond_0
    iget-object v0, p0, Lh/x;->h:Lh/s0;

    iput-object p1, v0, Lh/s0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lh/s0;->d:Z

    .line 1
    iput-object v0, p0, Lh/x;->b:Lh/s0;

    iput-object v0, p0, Lh/x;->c:Lh/s0;

    iput-object v0, p0, Lh/x;->d:Lh/s0;

    iput-object v0, p0, Lh/x;->e:Lh/s0;

    iput-object v0, p0, Lh/x;->f:Lh/s0;

    iput-object v0, p0, Lh/x;->g:Lh/s0;

    return-void
.end method

.method public k(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lh/x;->h:Lh/s0;

    if-nez v0, :cond_0

    new-instance v0, Lh/s0;

    invoke-direct {v0}, Lh/s0;-><init>()V

    iput-object v0, p0, Lh/x;->h:Lh/s0;

    :cond_0
    iget-object v0, p0, Lh/x;->h:Lh/s0;

    iput-object p1, v0, Lh/s0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lh/s0;->c:Z

    .line 1
    iput-object v0, p0, Lh/x;->b:Lh/s0;

    iput-object v0, p0, Lh/x;->c:Lh/s0;

    iput-object v0, p0, Lh/x;->d:Lh/s0;

    iput-object v0, p0, Lh/x;->e:Lh/s0;

    iput-object v0, p0, Lh/x;->f:Lh/s0;

    iput-object v0, p0, Lh/x;->g:Lh/s0;

    return-void
.end method

.method public final l(Landroid/content/Context;Lh/u0;)V
    .locals 10

    iget v0, p0, Lh/x;->j:I

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Lh/u0;->h(II)I

    move-result v0

    iput v0, p0, Lh/x;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lt v0, v2, :cond_0

    const/16 v5, 0xb

    invoke-virtual {p2, v5, v3}, Lh/u0;->h(II)I

    move-result v5

    iput v5, p0, Lh/x;->k:I

    if-eq v5, v3, :cond_0

    iget v5, p0, Lh/x;->j:I

    and-int/2addr v5, v1

    or-int/2addr v5, v4

    iput v5, p0, Lh/x;->j:I

    :cond_0
    const/16 v5, 0xa

    invoke-virtual {p2, v5}, Lh/u0;->m(I)Z

    move-result v6

    const/16 v7, 0xc

    const/4 v8, 0x1

    if-nez v6, :cond_6

    invoke-virtual {p2, v7}, Lh/u0;->m(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v8}, Lh/u0;->m(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v4, p0, Lh/x;->m:Z

    invoke-virtual {p2, v8, v8}, Lh/u0;->h(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v6, 0x0

    iput-object v6, p0, Lh/x;->l:Landroid/graphics/Typeface;

    invoke-virtual {p2, v7}, Lh/u0;->m(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move v5, v7

    :cond_7
    iget v6, p0, Lh/x;->k:I

    iget v7, p0, Lh/x;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Lh/x;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lh/x$a;

    invoke-direct {v9, p0, v6, v7, p1}, Lh/x$a;-><init>(Lh/x;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Lh/x;->j:I

    invoke-virtual {p2, v5, p1, v9}, Lh/u0;->g(IILw/b;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v2, :cond_9

    iget v0, p0, Lh/x;->k:I

    if-eq v0, v3, :cond_9

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Lh/x;->k:I

    iget v6, p0, Lh/x;->j:I

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    move v6, v8

    goto :goto_3

    :cond_8
    move v6, v4

    :goto_3
    invoke-static {p1, v0, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_9
    iput-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    :cond_a
    iget-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v8

    goto :goto_4

    :cond_b
    move p1, v4

    :goto_4
    iput-boolean p1, p0, Lh/x;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v5}, Lh/u0;->k(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_e

    iget p2, p0, Lh/x;->k:I

    if-eq p2, v3, :cond_e

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lh/x;->k:I

    iget v0, p0, Lh/x;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move v4, v8

    :cond_d
    invoke-static {p1, p2, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_5

    :cond_e
    iget p2, p0, Lh/x;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_5
    iput-object p1, p0, Lh/x;->l:Landroid/graphics/Typeface;

    :cond_f
    return-void
.end method
