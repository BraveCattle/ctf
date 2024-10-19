.class public Lcom/google/android/material/floatingactionbutton/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/floatingactionbutton/c$a;,
        Lcom/google/android/material/floatingactionbutton/c$c;,
        Lcom/google/android/material/floatingactionbutton/c$b;,
        Lcom/google/android/material/floatingactionbutton/c$e;,
        Lcom/google/android/material/floatingactionbutton/c$f;,
        Lcom/google/android/material/floatingactionbutton/c$d;
    }
.end annotation


# static fields
.field public static final t:Landroid/animation/TimeInterpolator;

.field public static final u:[I

.field public static final v:[I

.field public static final w:[I

.field public static final x:[I

.field public static final y:[I

.field public static final z:[I


# instance fields
.field public a:I

.field public b:Landroid/animation/Animator;

.field public c:Lv0/g;

.field public d:Lv0/g;

.field public e:Lv0/g;

.field public f:Lv0/g;

.field public final g:Ld1/d;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ld1/g;

.field public final p:Lf1/b;

.field public final q:Landroid/graphics/Rect;

.field public final r:Landroid/graphics/Matrix;

.field public s:Landroid/view/ViewTreeObserver$OnPreDrawListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lv0/a;->b:Landroid/animation/TimeInterpolator;

    sput-object v0, Lcom/google/android/material/floatingactionbutton/c;->t:Landroid/animation/TimeInterpolator;

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/material/floatingactionbutton/c;->u:[I

    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    sput-object v1, Lcom/google/android/material/floatingactionbutton/c;->v:[I

    new-array v1, v0, [I

    fill-array-data v1, :array_2

    sput-object v1, Lcom/google/android/material/floatingactionbutton/c;->w:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/google/android/material/floatingactionbutton/c;->x:[I

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x101009e

    const/4 v2, 0x0

    aput v1, v0, v2

    sput-object v0, Lcom/google/android/material/floatingactionbutton/c;->y:[I

    new-array v0, v2, [I

    sput-object v0, Lcom/google/android/material/floatingactionbutton/c;->z:[I

    return-void

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data

    :array_1
    .array-data 4
        0x1010367
        0x101009c
        0x101009e
    .end array-data

    :array_2
    .array-data 4
        0x101009c
        0x101009e
    .end array-data

    :array_3
    .array-data 4
        0x1010367
        0x101009e
    .end array-data
.end method

.method public constructor <init>(Ld1/g;Lf1/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/floatingactionbutton/c;->a:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/android/material/floatingactionbutton/c;->l:F

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->q:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->r:Landroid/graphics/Matrix;

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    iput-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->p:Lf1/b;

    new-instance p2, Ld1/d;

    invoke-direct {p2}, Ld1/d;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->g:Ld1/d;

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->u:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$c;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$c;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->v:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$b;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->w:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$b;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->x:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$b;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->y:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$e;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$e;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    sget-object v0, Lcom/google/android/material/floatingactionbutton/c;->z:[I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/c$a;

    invoke-direct {v1, p0}, Lcom/google/android/material/floatingactionbutton/c$a;-><init>(Lcom/google/android/material/floatingactionbutton/c;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/c;->b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ld1/d;->a([ILandroid/animation/ValueAnimator;)V

    invoke-virtual {p1}, Landroid/widget/ImageButton;->getRotation()F

    move-result p1

    iput p1, p0, Lcom/google/android/material/floatingactionbutton/c;->h:F

    return-void
.end method


# virtual methods
.method public final a(Lv0/g;FFF)Landroid/animation/AnimatorSet;
    .locals 5

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v2, 0x1

    new-array v3, v2, [F

    const/4 v4, 0x0

    aput p2, v3, v4

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-string v0, "opacity"

    invoke-virtual {p1, v0}, Lv0/g;->c(Ljava/lang/String;)Lv0/h;

    move-result-object v0

    invoke-virtual {v0, p2}, Lv0/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    sget-object v0, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    new-array v1, v2, [F

    aput p3, v1, v4

    invoke-static {p2, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-string v0, "scale"

    invoke-virtual {p1, v0}, Lv0/g;->c(Ljava/lang/String;)Lv0/h;

    move-result-object v1

    invoke-virtual {v1, p2}, Lv0/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    sget-object v1, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    new-array v3, v2, [F

    aput p3, v3, v4

    invoke-static {p2, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    invoke-virtual {p1, v0}, Lv0/g;->c(Ljava/lang/String;)Lv0/h;

    move-result-object p3

    invoke-virtual {p3, p2}, Lv0/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->r:Landroid/graphics/Matrix;

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    invoke-virtual {p2}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    new-instance p3, Lv0/e;

    invoke-direct {p3}, Lv0/e;-><init>()V

    new-instance v0, Lv0/f;

    invoke-direct {v0}, Lv0/f;-><init>()V

    new-array v1, v2, [Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/google/android/material/floatingactionbutton/c;->r:Landroid/graphics/Matrix;

    invoke-direct {v2, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    aput-object v2, v1, v4

    invoke-static {p2, p3, v0, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-string p3, "iconScale"

    invoke-virtual {p1, p3}, Lv0/g;->c(Ljava/lang/String;)Lv0/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lv0/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-static {p1, p4}, Lb/a;->g(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    return-object p1
.end method

.method public final b(Lcom/google/android/material/floatingactionbutton/c$f;)Landroid/animation/ValueAnimator;
    .locals 3

    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    sget-object v1, Lcom/google/android/material/floatingactionbutton/c;->t:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public c()F
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public d(Landroid/graphics/Rect;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public e()Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/c;->a:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/c;->a:I

    if-eq v0, v2, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public f()V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public g()V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public h([I)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public i(FFF)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public j(Landroid/graphics/Rect;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public final k(F)V
    .locals 1

    iput p1, p0, Lcom/google/android/material/floatingactionbutton/c;->l:F

    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/c;->r:Landroid/graphics/Matrix;

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public l(Landroid/content/res/ColorStateList;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public final m()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->o:Ld1/g;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/c;->q:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/c;->d(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/c;->j(Landroid/graphics/Rect;)V

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/c;->p:Lf1/b;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$b;

    .line 1
    iget-object v0, v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$b;->a:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    throw v0
.end method
