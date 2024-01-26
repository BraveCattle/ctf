.class public Landroidx/recyclerview/widget/k;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Le0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/k$e;,
        Landroidx/recyclerview/widget/k$g;,
        Landroidx/recyclerview/widget/k$h;,
        Landroidx/recyclerview/widget/k$l;,
        Landroidx/recyclerview/widget/k$s;,
        Landroidx/recyclerview/widget/k$r;,
        Landroidx/recyclerview/widget/k$k;,
        Landroidx/recyclerview/widget/k$v;,
        Landroidx/recyclerview/widget/k$q;,
        Landroidx/recyclerview/widget/k$n;,
        Landroidx/recyclerview/widget/k$m;,
        Landroidx/recyclerview/widget/k$i;,
        Landroidx/recyclerview/widget/k$j;,
        Landroidx/recyclerview/widget/k$d;,
        Landroidx/recyclerview/widget/k$t;,
        Landroidx/recyclerview/widget/k$p;,
        Landroidx/recyclerview/widget/k$o;,
        Landroidx/recyclerview/widget/k$f;,
        Landroidx/recyclerview/widget/k$u;
    }
.end annotation


# static fields
.field public static final s0:[I

.field public static final t0:[I

.field public static final u0:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final v0:Landroid/view/animation/Interpolator;


# instance fields
.field public A:I

.field public B:I

.field public C:Landroidx/recyclerview/widget/k$f;

.field public D:Landroid/widget/EdgeEffect;

.field public E:Landroid/widget/EdgeEffect;

.field public F:Landroid/widget/EdgeEffect;

.field public G:Landroid/widget/EdgeEffect;

.field public H:Landroidx/recyclerview/widget/k$g;

.field public I:I

.field public J:I

.field public K:Landroid/view/VelocityTracker;

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public final Q:I

.field public final R:I

.field public S:F

.field public T:F

.field public U:Z

.field public final V:Landroidx/recyclerview/widget/k$u;

.field public W:Landroidx/recyclerview/widget/e;

.field public a0:Landroidx/recyclerview/widget/e$b;

.field public final b:Landroidx/recyclerview/widget/k$p;

.field public final b0:Landroidx/recyclerview/widget/k$s;

.field public c:Landroidx/recyclerview/widget/k$r;

.field public c0:Landroidx/recyclerview/widget/k$n;

.field public d:Landroidx/recyclerview/widget/a;

.field public d0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/k$n;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroidx/recyclerview/widget/b;

.field public e0:Z

.field public final f:Landroidx/recyclerview/widget/r;

.field public f0:Z

.field public g:Z

.field public g0:Landroidx/recyclerview/widget/k$g$b;

.field public final h:Landroid/graphics/Rect;

.field public h0:Z

.field public final i:Landroid/graphics/Rect;

.field public i0:Landroidx/recyclerview/widget/n;

.field public final j:Landroid/graphics/RectF;

.field public j0:Landroidx/recyclerview/widget/k$e;

.field public k:Landroidx/recyclerview/widget/k$j;

.field public final k0:[I

.field public l:Landroidx/recyclerview/widget/k$q;

.field public l0:Le0/g;

.field public final m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$i;",
            ">;"
        }
    .end annotation
.end field

.field public final m0:[I

.field public final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$m;",
            ">;"
        }
    .end annotation
.end field

.field public final n0:[I

.field public o:Landroidx/recyclerview/widget/k$m;

.field public final o0:[I

.field public p:Z

.field public final p0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field

.field public q:Z

.field public q0:Ljava/lang/Runnable;

.field public r:Z

.field public final r0:Landroidx/recyclerview/widget/r$b;

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:I

.field public final x:Landroid/view/accessibility/AccessibilityManager;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    const v3, 0x1010436

    aput v3, v1, v2

    sput-object v1, Landroidx/recyclerview/widget/k;->s0:[I

    new-array v1, v0, [I

    const v3, 0x10100eb

    aput v3, v1, v2

    sput-object v1, Landroidx/recyclerview/widget/k;->t0:[I

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    aput-object v3, v1, v2

    const-class v2, Landroid/util/AttributeSet;

    aput-object v2, v1, v0

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/4 v2, 0x3

    aput-object v0, v1, v2

    sput-object v1, Landroidx/recyclerview/widget/k;->u0:[Ljava/lang/Class;

    new-instance v0, Landroidx/recyclerview/widget/k$b;

    invoke-direct {v0}, Landroidx/recyclerview/widget/k$b;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/k;->v0:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroidx/recyclerview/widget/k$p;

    invoke-direct {v0, v10}, Landroidx/recyclerview/widget/k$p;-><init>(Landroidx/recyclerview/widget/k;)V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    new-instance v0, Landroidx/recyclerview/widget/r;

    invoke-direct {v0}, Landroidx/recyclerview/widget/r;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->f:Landroidx/recyclerview/widget/r;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->i:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->j:Landroid/graphics/RectF;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    const/4 v14, 0x0

    iput v14, v10, Landroidx/recyclerview/widget/k;->s:I

    iput-boolean v14, v10, Landroidx/recyclerview/widget/k;->y:Z

    iput-boolean v14, v10, Landroidx/recyclerview/widget/k;->z:Z

    iput v14, v10, Landroidx/recyclerview/widget/k;->A:I

    iput v14, v10, Landroidx/recyclerview/widget/k;->B:I

    new-instance v0, Landroidx/recyclerview/widget/k$f;

    invoke-direct {v0}, Landroidx/recyclerview/widget/k$f;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    new-instance v0, Landroidx/recyclerview/widget/c;

    invoke-direct {v0}, Landroidx/recyclerview/widget/c;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    iput v14, v10, Landroidx/recyclerview/widget/k;->I:I

    const/4 v0, -0x1

    iput v0, v10, Landroidx/recyclerview/widget/k;->J:I

    const/4 v1, 0x1

    iput v1, v10, Landroidx/recyclerview/widget/k;->S:F

    iput v1, v10, Landroidx/recyclerview/widget/k;->T:F

    const/4 v1, 0x1

    iput-boolean v1, v10, Landroidx/recyclerview/widget/k;->U:Z

    new-instance v2, Landroidx/recyclerview/widget/k$u;

    invoke-direct {v2, v10}, Landroidx/recyclerview/widget/k$u;-><init>(Landroidx/recyclerview/widget/k;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->V:Landroidx/recyclerview/widget/k$u;

    new-instance v2, Landroidx/recyclerview/widget/e$b;

    invoke-direct {v2}, Landroidx/recyclerview/widget/e$b;-><init>()V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->a0:Landroidx/recyclerview/widget/e$b;

    new-instance v2, Landroidx/recyclerview/widget/k$s;

    invoke-direct {v2}, Landroidx/recyclerview/widget/k$s;-><init>()V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    iput-boolean v14, v10, Landroidx/recyclerview/widget/k;->e0:Z

    iput-boolean v14, v10, Landroidx/recyclerview/widget/k;->f0:Z

    new-instance v2, Landroidx/recyclerview/widget/k$h;

    invoke-direct {v2, v10}, Landroidx/recyclerview/widget/k$h;-><init>(Landroidx/recyclerview/widget/k;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->g0:Landroidx/recyclerview/widget/k$g$b;

    iput-boolean v14, v10, Landroidx/recyclerview/widget/k;->h0:Z

    const/4 v15, 0x2

    new-array v2, v15, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->k0:[I

    new-array v2, v15, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->m0:[I

    new-array v2, v15, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->n0:[I

    new-array v2, v15, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->o0:[I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    new-instance v2, Landroidx/recyclerview/widget/k$a;

    invoke-direct {v2, v10}, Landroidx/recyclerview/widget/k$a;-><init>(Landroidx/recyclerview/widget/k;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->q0:Ljava/lang/Runnable;

    new-instance v2, Landroidx/recyclerview/widget/k$c;

    invoke-direct {v2, v10}, Landroidx/recyclerview/widget/k$c;-><init>(Landroidx/recyclerview/widget/k;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->r0:Landroidx/recyclerview/widget/r$b;

    if-eqz v12, :cond_0

    sget-object v2, Landroidx/recyclerview/widget/k;->t0:[I

    invoke-virtual {v11, v12, v2, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2, v14, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v10, Landroidx/recyclerview/widget/k;->g:Z

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_0
    iput-boolean v1, v10, Landroidx/recyclerview/widget/k;->g:Z

    :goto_0
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->setScrollContainer(Z)V

    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, v10, Landroidx/recyclerview/widget/k;->P:I

    sget-object v3, Le0/n;->a:Ljava/lang/reflect/Method;

    .line 1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_1

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    move-result v5

    goto :goto_1

    :cond_1
    invoke-static {v2, v11}, Le0/n;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v5

    .line 2
    :goto_1
    iput v5, v10, Landroidx/recyclerview/widget/k;->S:F

    if-lt v3, v4, :cond_2

    .line 3
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    move-result v5

    goto :goto_2

    :cond_2
    invoke-static {v2, v11}, Le0/n;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v5

    .line 4
    :goto_2
    iput v5, v10, Landroidx/recyclerview/widget/k;->T:F

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v5

    iput v5, v10, Landroidx/recyclerview/widget/k;->Q:I

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, v10, Landroidx/recyclerview/widget/k;->R:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v2

    if-ne v2, v15, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    move v2, v14

    :goto_3
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    iget-object v2, v10, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    iget-object v5, v10, Landroidx/recyclerview/widget/k;->g0:Landroidx/recyclerview/widget/k$g$b;

    .line 5
    iput-object v5, v2, Landroidx/recyclerview/widget/k$g;->a:Landroidx/recyclerview/widget/k$g$b;

    .line 6
    new-instance v2, Landroidx/recyclerview/widget/a;

    new-instance v5, Landroidx/recyclerview/widget/m;

    invoke-direct {v5, v10}, Landroidx/recyclerview/widget/m;-><init>(Landroidx/recyclerview/widget/k;)V

    invoke-direct {v2, v5}, Landroidx/recyclerview/widget/a;-><init>(Landroidx/recyclerview/widget/a$a;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    .line 7
    new-instance v2, Landroidx/recyclerview/widget/b;

    new-instance v5, Landroidx/recyclerview/widget/l;

    invoke-direct {v5, v10}, Landroidx/recyclerview/widget/l;-><init>(Landroidx/recyclerview/widget/k;)V

    invoke-direct {v2, v5}, Landroidx/recyclerview/widget/b;-><init>(Landroidx/recyclerview/widget/b$b;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    .line 8
    sget-object v2, Le0/m;->a:Ljava/util/WeakHashMap;

    if-lt v3, v4, :cond_4

    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getImportantForAutofill()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v14

    :goto_4
    if-nez v2, :cond_5

    const/16 v2, 0x8

    if-lt v3, v4, :cond_5

    .line 10
    invoke-virtual {v10, v2}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 11
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v2

    if-nez v2, :cond_6

    .line 12
    invoke-virtual {v10, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 13
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "accessibility"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityManager;

    iput-object v2, v10, Landroidx/recyclerview/widget/k;->x:Landroid/view/accessibility/AccessibilityManager;

    new-instance v2, Landroidx/recyclerview/widget/n;

    invoke-direct {v2, v10}, Landroidx/recyclerview/widget/n;-><init>(Landroidx/recyclerview/widget/k;)V

    invoke-virtual {v10, v2}, Landroidx/recyclerview/widget/k;->setAccessibilityDelegateCompat(Landroidx/recyclerview/widget/n;)V

    const/high16 v2, 0x40000

    if-eqz v12, :cond_e

    sget-object v3, Lo0/a;->a:[I

    invoke-virtual {v11, v12, v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    const/4 v3, 0x7

    invoke-virtual {v9, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v9, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    if-ne v1, v0, :cond_7

    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_7
    invoke-virtual {v9, v15, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    const/4 v8, 0x3

    const/4 v1, 0x4

    if-eqz v0, :cond_9

    const/4 v0, 0x5

    invoke-virtual {v9, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    const/4 v0, 0x6

    invoke-virtual {v9, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v9, v8}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v9, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v3, :cond_8

    if-eqz v4, :cond_8

    if-eqz v5, :cond_8

    if-eqz v6, :cond_8

    .line 14
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/d;

    const v2, 0x7f060086

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    const v2, 0x7f060088

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v17

    const v2, 0x7f060087

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    const/16 v18, 0x4

    move-object/from16 v2, p0

    move/from16 v19, v8

    move/from16 v8, v17

    move-object/from16 v17, v9

    move v9, v0

    invoke-direct/range {v1 .. v9}, Landroidx/recyclerview/widget/d;-><init>(Landroidx/recyclerview/widget/k;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    move/from16 v1, v18

    goto :goto_5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to set fast scroller without both required drawables."

    invoke-static {v1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v10, v1}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move/from16 v19, v8

    move-object/from16 v17, v9

    .line 15
    :goto_5
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    const-string v2, ": Could not instantiate the LayoutManager: "

    if-eqz v16, :cond_d

    .line 16
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    .line 17
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_a
    const-string v3, "."

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_6
    move-object v3, v0

    goto :goto_8

    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v5, Landroidx/recyclerview/widget/k;

    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_7
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 18
    :goto_8
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_9

    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    :goto_9
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v4, Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v0, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v5, 0x0

    :try_start_1
    sget-object v0, Landroidx/recyclerview/widget/k;->u0:[Ljava/lang/Class;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v11, v1, v14

    const/4 v6, 0x1

    aput-object v12, v1, v6

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v15

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v19
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v5, v1

    goto :goto_a

    :catch_0
    move-exception v0

    move-object v1, v0

    :try_start_2
    new-array v0, v14, [Ljava/lang/Class;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_a
    const/4 v1, 0x1

    :try_start_3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/k;->setLayoutManager(Landroidx/recyclerview/widget/k$j;)V

    goto/16 :goto_b

    :catch_1
    move-exception v0

    invoke-virtual {v0, v1}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Error creating LayoutManager "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Class is not a LayoutManager "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Cannot access non-public constructor "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_5
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_6
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Unable to find LayoutManager "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 19
    :cond_d
    :goto_b
    sget-object v0, Landroidx/recyclerview/widget/k;->s0:[I

    invoke-virtual {v11, v12, v0, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v14, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_c

    :cond_e
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :goto_c
    invoke-virtual {v10, v1}, Landroidx/recyclerview/widget/k;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public static synthetic b(Landroidx/recyclerview/widget/k;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(I)V

    return-void
.end method

.method public static synthetic d(Landroidx/recyclerview/widget/k;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    move-result p0

    return p0
.end method

.method public static g(Landroidx/recyclerview/widget/k$v;)V
    .locals 0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private getScrollingChildHelper()Le0/g;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->l0:Le0/g;

    if-nez v0, :cond_0

    new-instance v0, Le0/g;

    invoke-direct {v0, p0}, Le0/g;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->l0:Le0/g;

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->l0:Le0/g;

    return-object v0
.end method

.method public static u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/k$k;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->A:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/k;->A:I

    return-void
.end method

.method public B(Z)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/k;->A:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/k;->A:I

    if-ge v0, v1, :cond_3

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/k;->A:I

    if-eqz p1, :cond_3

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/k;->w:I

    iput v0, p0, Landroidx/recyclerview/widget/k;->w:I

    if-eqz p1, :cond_1

    .line 2
    iget-object v2, p0, Landroidx/recyclerview/widget/k;->x:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    const/16 v1, 0x800

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 4
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 5
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-gez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/k$v;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final C(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/k;->J:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Landroidx/recyclerview/widget/k;->N:I

    iput v1, p0, Landroidx/recyclerview/widget/k;->L:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v2

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/k;->O:I

    iput p1, p0, Landroidx/recyclerview/widget/k;->M:I

    :cond_1
    return-void
.end method

.method public D()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$g;->d()V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->I(Landroidx/recyclerview/widget/k$p;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->J(Landroidx/recyclerview/widget/k$p;)V

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->b()V

    return-void
.end method

.method public final E(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    if-eqz p2, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/recyclerview/widget/k$k;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/recyclerview/widget/k$k;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/k$k;->b:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Landroidx/recyclerview/widget/k$k;->a:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iget v2, v1, Landroid/graphics/Rect;->right:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->right:I

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v0

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v8, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->r:Z

    const/4 v1, 0x1

    xor-int/lit8 v9, v0, 0x1

    if-nez p2, :cond_3

    move v10, v1

    goto :goto_1

    :cond_3
    move v10, v4

    :goto_1
    move-object v6, p0

    move-object v7, p1

    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/k$j;->M(Landroidx/recyclerview/widget/k;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    return-void
.end method

.method public final F()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->a(I)V

    .line 1
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_4
    if-eqz v0, :cond_5

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_5
    return-void
.end method

.method public G(IILandroid/view/MotionEvent;)Z
    .locals 10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->i()V

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    iget-object v5, p0, Landroidx/recyclerview/widget/k;->m0:[I

    const/4 v6, 0x0

    move-object v0, p0

    move v3, v8

    move v4, v7

    invoke-virtual/range {v0 .. v6}, Landroidx/recyclerview/widget/k;->m(IIII[II)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget p1, p0, Landroidx/recyclerview/widget/k;->N:I

    iget-object p2, p0, Landroidx/recyclerview/widget/k;->m0:[I

    aget v0, p2, v2

    sub-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/k;->N:I

    iget p1, p0, Landroidx/recyclerview/widget/k;->O:I

    aget v0, p2, v1

    sub-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/k;->O:I

    if-eqz p3, :cond_1

    aget p1, p2, v2

    int-to-float p1, p1

    aget p2, p2, v1

    int-to-float p2, p2

    invoke-virtual {p3, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->o0:[I

    aget p2, p1, v2

    iget-object p3, p0, Landroidx/recyclerview/widget/k;->m0:[I

    aget v0, p3, v2

    add-int/2addr p2, v0

    aput p2, p1, v2

    aget p2, p1, v1

    aget p3, p3, v1

    add-int/2addr p2, p3

    aput p2, p1, v1

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_a

    if-eqz p3, :cond_9

    const/16 v0, 0x2002

    .line 1
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    and-int/2addr v3, v0

    if-ne v3, v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    if-nez v0, :cond_9

    .line 2
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    int-to-float v3, v8

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result p3

    int-to-float v4, v7

    const/4 v5, 0x0

    cmpg-float v6, v3, v5

    const/high16 v7, 0x3f800000    # 1.0f

    if-gez v6, :cond_4

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->o()V

    iget-object v6, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    neg-float v8, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr p3, v9

    sub-float p3, v7, p3

    goto :goto_1

    :cond_4
    cmpl-float v6, v3, v5

    if-lez v6, :cond_5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->p()V

    iget-object v6, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float v8, v3, v8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr p3, v9

    .line 4
    :goto_1
    invoke-virtual {v6, v8, p3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    move p3, v1

    goto :goto_2

    :cond_5
    move p3, v2

    :goto_2
    cmpg-float v6, v4, v5

    if-gez v6, :cond_6

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->q()V

    iget-object p3, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    neg-float v6, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v0, v7

    .line 6
    invoke-virtual {p3, v6, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    goto :goto_3

    :cond_6
    cmpl-float v6, v4, v5

    if-lez v6, :cond_7

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->n()V

    iget-object p3, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float v6, v4, v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v0, v8

    sub-float/2addr v7, v0

    .line 8
    invoke-virtual {p3, v6, v7}, Landroid/widget/EdgeEffect;->onPull(FF)V

    goto :goto_3

    :cond_7
    move v1, p3

    :goto_3
    if-nez v1, :cond_8

    cmpl-float p3, v3, v5

    if-nez p3, :cond_8

    cmpl-float p3, v4, v5

    if-eqz p3, :cond_9

    .line 9
    :cond_8
    sget-object p3, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 11
    :cond_9
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/k;->h(II)V

    :cond_a
    :goto_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_b
    return v2
.end method

.method public H(Landroidx/recyclerview/widget/k$v;I)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iput p2, p1, Landroidx/recyclerview/widget/k$v;->m:I

    iget-object p2, p0, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Le0/m;->a:Ljava/util/WeakHashMap;

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public I(II)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v0, :cond_0

    const-string p1, "RecyclerView"

    const-string p2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-eqz v1, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move v5, v1

    goto :goto_0

    :cond_2
    move v5, p1

    :goto_0
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result p1

    if-nez p1, :cond_3

    move v6, v1

    goto :goto_1

    :cond_3
    move v6, p2

    :goto_1
    if-nez v5, :cond_4

    if-eqz v6, :cond_a

    :cond_4
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->V:Landroidx/recyclerview/widget/k$u;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result p2

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-le p2, v0, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    move v2, v1

    :goto_2
    int-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-int v3, v3

    mul-int v4, v5, v5

    mul-int v7, v6, v6

    add-int/2addr v7, v4

    int-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    double-to-int v4, v7

    iget-object v7, p1, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    if-eqz v2, :cond_6

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getWidth()I

    move-result v7

    goto :goto_3

    :cond_6
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getHeight()I

    move-result v7

    :goto_3
    div-int/lit8 v8, v7, 0x2

    int-to-float v4, v4

    const/high16 v9, 0x3f800000    # 1.0f

    mul-float/2addr v4, v9

    int-to-float v7, v7

    div-float/2addr v4, v7

    invoke-static {v9, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    int-to-float v8, v8

    const/high16 v10, 0x3f000000    # 0.5f

    sub-float/2addr v4, v10

    const v10, 0x3ef1463b

    mul-float/2addr v4, v10

    float-to-double v10, v4

    .line 3
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    double-to-float v4, v10

    mul-float/2addr v4, v8

    add-float/2addr v4, v8

    if-lez v3, :cond_7

    const/high16 p2, 0x447a0000    # 1000.0f

    int-to-float v0, v3

    div-float/2addr v4, v0

    .line 4
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    mul-int/lit8 p2, p2, 0x4

    goto :goto_5

    :cond_7
    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    move p2, v0

    :goto_4
    int-to-float p2, p2

    div-float/2addr p2, v7

    add-float/2addr p2, v9

    const/high16 v0, 0x43960000    # 300.0f

    mul-float/2addr p2, v0

    float-to-int p2, p2

    :goto_5
    const/16 v0, 0x7d0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 5
    sget-object p2, Landroidx/recyclerview/widget/k;->v0:Landroid/view/animation/Interpolator;

    .line 6
    iget-object v0, p1, Landroidx/recyclerview/widget/k$u;->e:Landroid/view/animation/Interpolator;

    if-eq v0, p2, :cond_9

    iput-object p2, p1, Landroidx/recyclerview/widget/k$u;->e:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/widget/OverScroller;

    iget-object v2, p1, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p1, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    :cond_9
    iget-object p2, p1, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    iput v1, p1, Landroidx/recyclerview/widget/k$u;->c:I

    iput v1, p1, Landroidx/recyclerview/widget/k$u;->b:I

    iget-object v2, p1, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$u;->a()V

    :cond_a
    :goto_6
    return-void
.end method

.method public J()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/k;->s:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/k;->s:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->t:Z

    :cond_0
    return-void
.end method

.method public K(II)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0/g;->h(II)Z

    move-result p1

    return p1
.end method

.method public L(Z)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/k;->s:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    iput v1, p0, Landroidx/recyclerview/widget/k;->s:I

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-boolean v2, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-nez v2, :cond_1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->t:Z

    :cond_1
    iget v2, p0, Landroidx/recyclerview/widget/k;->s:I

    if-ne v2, v1, :cond_3

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/recyclerview/widget/k;->t:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    :cond_2
    iget-boolean p1, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-nez p1, :cond_3

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->t:Z

    :cond_3
    sub-int/2addr v2, v1

    iput v2, p0, Landroidx/recyclerview/widget/k;->s:I

    return-void
.end method

.method public M()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->V:Landroidx/recyclerview/widget/k$u;

    .line 2
    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method

.method public a(I)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0/g;->i(I)V

    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    instance-of v0, p1, Landroidx/recyclerview/widget/k$k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    check-cast p1, Landroidx/recyclerview/widget/k$k;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$j;->d(Landroidx/recyclerview/widget/k$k;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public computeHorizontalScrollExtent()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->f(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public computeHorizontalScrollOffset()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->g(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public computeHorizontalScrollRange()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->h(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public computeVerticalScrollExtent()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->i(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public computeVerticalScrollOffset()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->j(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public computeVerticalScrollRange()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k$j;->k(Landroidx/recyclerview/widget/k$s;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Le0/g;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0/g;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Le0/g;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Le0/g;->d(IIII[I)Z

    move-result p1

    return p1
.end method

.method public dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/k$i;

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v3, p1, p0, v4}, Landroidx/recyclerview/widget/k$i;->d(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/k;Landroidx/recyclerview/widget/k$s;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-boolean v3, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v4, v3

    int-to-float v3, v4

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_2

    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-boolean v4, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_4
    iget-object v4, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_5

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v2

    goto :goto_4

    :cond_5
    move v4, v1

    :goto_4
    or-int/2addr v3, v4

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_6
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    iget-boolean v5, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v5, :cond_7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    goto :goto_5

    :cond_7
    move v5, v1

    :goto_5
    const/high16 v6, 0x42b40000    # 90.0f

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v5, v5

    int-to-float v5, v5

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_8

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_8

    move v4, v2

    goto :goto_6

    :cond_8
    move v4, v1

    :goto_6
    or-int/2addr v3, v4

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_9
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v4, 0x43340000    # 180.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    iget-boolean v4, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v4, :cond_a

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v4

    int-to-float v4, v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v5

    int-to-float v5, v6

    goto :goto_7

    :cond_a
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    :goto_7
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_b

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_b

    move v1, v2

    :cond_b
    or-int/2addr v3, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_c
    if-nez v3, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz p1, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$g;->e()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_8

    :cond_d
    move v2, v3

    :goto_8
    if-eqz v2, :cond_e

    sget-object p1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_e
    return-void
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/k;->B:I

    if-lez p1, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, ""

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v0, "RecyclerView"

    const-string v1, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    return-void
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->F()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    return-void
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 12

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/k;->E(Landroid/view/View;Landroid/view/View;)V

    return-object p1

    :cond_1
    const/4 v1, 0x0

    if-eqz v0, :cond_16

    if-ne v0, p0, :cond_2

    goto/16 :goto_4

    .line 1
    :cond_2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->s(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const/4 v2, 0x1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->s(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_5

    goto/16 :goto_3

    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v3, v1, v1, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->i:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v3, v1, v1, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->i:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$j;->s()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v2, :cond_6

    move v3, v4

    goto :goto_0

    :cond_6
    move v3, v2

    :goto_0
    iget-object v5, p0, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    iget v6, v5, Landroid/graphics/Rect;->left:I

    iget-object v7, p0, Landroidx/recyclerview/widget/k;->i:Landroid/graphics/Rect;

    iget v8, v7, Landroid/graphics/Rect;->left:I

    if-lt v6, v8, :cond_7

    iget v9, v5, Landroid/graphics/Rect;->right:I

    if-gt v9, v8, :cond_8

    :cond_7
    iget v9, v5, Landroid/graphics/Rect;->right:I

    iget v10, v7, Landroid/graphics/Rect;->right:I

    if-ge v9, v10, :cond_8

    move v6, v2

    goto :goto_1

    :cond_8
    iget v9, v5, Landroid/graphics/Rect;->right:I

    iget v10, v7, Landroid/graphics/Rect;->right:I

    if-gt v9, v10, :cond_9

    if-lt v6, v10, :cond_a

    :cond_9
    if-le v6, v8, :cond_a

    move v6, v4

    goto :goto_1

    :cond_a
    move v6, v1

    :goto_1
    iget v8, v5, Landroid/graphics/Rect;->top:I

    iget v9, v7, Landroid/graphics/Rect;->top:I

    if-lt v8, v9, :cond_b

    iget v10, v5, Landroid/graphics/Rect;->bottom:I

    if-gt v10, v9, :cond_c

    :cond_b
    iget v10, v5, Landroid/graphics/Rect;->bottom:I

    iget v11, v7, Landroid/graphics/Rect;->bottom:I

    if-ge v10, v11, :cond_c

    move v4, v2

    goto :goto_2

    :cond_c
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    if-gt v5, v7, :cond_d

    if-lt v8, v7, :cond_e

    :cond_d
    if-le v8, v9, :cond_e

    goto :goto_2

    :cond_e
    move v4, v1

    :goto_2
    if-eq p2, v2, :cond_14

    const/4 v5, 0x2

    if-eq p2, v5, :cond_13

    const/16 v3, 0x11

    if-eq p2, v3, :cond_12

    const/16 v3, 0x21

    if-eq p2, v3, :cond_11

    const/16 v3, 0x42

    if-eq p2, v3, :cond_10

    const/16 v3, 0x82

    if-ne p2, v3, :cond_f

    if-lez v4, :cond_16

    goto :goto_3

    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid direction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0, v0}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    if-lez v6, :cond_16

    goto :goto_3

    :cond_11
    if-gez v4, :cond_16

    goto :goto_3

    :cond_12
    if-gez v6, :cond_16

    goto :goto_3

    :cond_13
    if-gtz v4, :cond_15

    if-nez v4, :cond_16

    mul-int/2addr v6, v3

    if-ltz v6, :cond_16

    goto :goto_3

    :cond_14
    if-ltz v4, :cond_15

    if-nez v4, :cond_16

    mul-int/2addr v6, v3

    if-gtz v6, :cond_16

    :cond_15
    :goto_3
    move v1, v2

    :cond_16
    :goto_4
    if-eqz v1, :cond_17

    goto :goto_5

    .line 2
    :cond_17
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    :goto_5
    return-object v0
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->l()Landroidx/recyclerview/widget/k$k;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-static {v1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0, v1}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/k$j;->m(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/k$k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RecyclerView has no LayoutManager"

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$j;->n(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/k$k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RecyclerView has no LayoutManager"

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAdapter()Landroidx/recyclerview/widget/k$d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    move-result v0

    return v0
.end method

.method public getChildDrawingOrder(II)I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->j0:Landroidx/recyclerview/widget/k$e;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/k$e;->a(II)I

    move-result p1

    return p1
.end method

.method public getClipToPadding()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->g:Z

    return v0
.end method

.method public getCompatAccessibilityDelegate()Landroidx/recyclerview/widget/n;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->i0:Landroidx/recyclerview/widget/n;

    return-object v0
.end method

.method public getEdgeEffectFactory()Landroidx/recyclerview/widget/k$f;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    return-object v0
.end method

.method public getItemAnimator()Landroidx/recyclerview/widget/k$g;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    return-object v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getLayoutManager()Landroidx/recyclerview/widget/k$j;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    return-object v0
.end method

.method public getMaxFlingVelocity()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->R:I

    return v0
.end method

.method public getMinFlingVelocity()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->Q:I

    return v0
.end method

.method public getNanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOnFlingListener()Landroidx/recyclerview/widget/k$l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->U:Z

    return v0
.end method

.method public getRecycledViewPool()Landroidx/recyclerview/widget/k$o;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->d()Landroidx/recyclerview/widget/k$o;

    move-result-object v0

    return-object v0
.end method

.method public getScrollState()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->I:I

    return v0
.end method

.method public h(II)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_1

    if-gez p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_2

    if-lez p2, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_3

    if-gez p2, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_3
    if-eqz v0, :cond_4

    sget-object p1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_4
    return-void
.end method

.method public hasNestedScrollingParent()Z
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Le0/g;->g(I)Z

    move-result v0

    return v0
.end method

.method public i()V
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->r:Z

    const-string v1, "RV FullInvalidate"

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/a;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, La0/a;->a:I

    .line 3
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->k()V

    .line 5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_2
    return-void

    .line 6
    :cond_3
    :goto_0
    sget v0, La0/a;->a:I

    .line 7
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->k()V

    .line 9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public isAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->p:Z

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    .line 1
    iget-boolean v0, v0, Le0/g;->d:Z

    return v0
.end method

.method public j(II)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    .line 2
    invoke-static {p1, v1, v0}, Landroidx/recyclerview/widget/k$j;->e(III)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    .line 4
    invoke-static {p2, v1, v0}, Landroidx/recyclerview/widget/k$j;->e(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public k()V
    .locals 2

    const-string v0, "RecyclerView"

    const-string v1, "No adapter attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public l(II[I[II)Z
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v4, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Le0/g;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public m(IIII[II)Z
    .locals 8

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v7, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 1
    invoke-virtual/range {v0 .. v7}, Le0/g;->e(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public n()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/k$f;->a(Landroidx/recyclerview/widget/k;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method public o()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/k$f;->a(Landroidx/recyclerview/widget/k;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v2

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/k;->A:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/recyclerview/widget/k;->p:Z

    iget-boolean v2, p0, Landroidx/recyclerview/widget/k;->r:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isLayoutRequested()Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Landroidx/recyclerview/widget/k;->r:Z

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v2, :cond_1

    .line 1
    iput-boolean v1, v2, Landroidx/recyclerview/widget/k$j;->f:Z

    .line 2
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->h0:Z

    sget-object v0, Landroidx/recyclerview/widget/e;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/e;

    iput-object v1, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    if-nez v1, :cond_3

    new-instance v1, Landroidx/recyclerview/widget/e;

    invoke-direct {v1}, Landroidx/recyclerview/widget/e;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v1

    const/high16 v2, 0x42700000    # 60.0f

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    move-result v1

    const/high16 v3, 0x41f00000    # 30.0f

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_2

    move v2, v1

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    const v3, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v3, v2

    float-to-long v2, v3

    iput-wide v2, v1, Landroidx/recyclerview/widget/e;->d:J

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    .line 5
    iget-object v0, v0, Landroidx/recyclerview/widget/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$g;->d()V

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->M()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->p:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 1
    iput-boolean v0, v1, Landroidx/recyclerview/widget/k$j;->f:Z

    invoke-virtual {v1, p0, v2}, Landroidx/recyclerview/widget/k$j;->B(Landroidx/recyclerview/widget/k;Landroidx/recyclerview/widget/k$p;)V

    .line 2
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->p0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->q0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->f:Landroidx/recyclerview/widget/r;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :goto_0
    sget-object v0, Landroidx/recyclerview/widget/r$a;->d:Ln/e;

    invoke-virtual {v0}, Ln/e;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, v0, Landroidx/recyclerview/widget/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    :cond_3
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/k$i;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    neg-float v0, v0

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    goto :goto_2

    :cond_3
    :goto_1
    move v3, v2

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v3, 0x400000

    and-int/2addr v0, v3

    if-eqz v0, :cond_6

    const/16 v0, 0x1a

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v3

    if-eqz v3, :cond_5

    neg-float v0, v0

    goto :goto_1

    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v0

    move v0, v2

    goto :goto_2

    :cond_6
    move v0, v2

    move v3, v0

    :goto_2
    cmpl-float v4, v0, v2

    if-nez v4, :cond_7

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_8

    :cond_7
    iget v2, p0, Landroidx/recyclerview/widget/k;->S:F

    mul-float/2addr v3, v2

    float-to-int v2, v3

    iget v3, p0, Landroidx/recyclerview/widget/k;->T:F

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-virtual {p0, v2, v0, p1}, Landroidx/recyclerview/widget/k;->G(IILandroid/view/MotionEvent;)Z

    :cond_8
    return v1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->u:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-nez v0, :cond_2

    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, Landroidx/recyclerview/widget/k;->o:Landroidx/recyclerview/widget/k$m;

    :cond_2
    iget-object v3, p0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v1

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v3, :cond_4

    iget-object v6, p0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/k$m;

    invoke-interface {v6, p0, p1}, Landroidx/recyclerview/widget/k$m;->b(Landroidx/recyclerview/widget/k;Landroid/view/MotionEvent;)Z

    move-result v7

    if-eqz v7, :cond_3

    if-eq v0, v2, :cond_3

    iput-object v6, p0, Landroidx/recyclerview/widget/k;->o:Landroidx/recyclerview/widget/k$m;

    move v0, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_1
    if-eqz v0, :cond_5

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->f()V

    return v5

    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v3

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    if-nez v4, :cond_7

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, p0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    :cond_7
    iget-object v4, p0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v6

    const/4 v7, 0x2

    const/high16 v8, 0x3f000000    # 0.5f

    if-eqz v4, :cond_10

    if-eq v4, v5, :cond_f

    if-eq v4, v7, :cond_b

    if-eq v4, v2, :cond_a

    const/4 v0, 0x5

    if-eq v4, v0, :cond_9

    const/4 v0, 0x6

    if-eq v4, v0, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->C(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_9
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroidx/recyclerview/widget/k;->N:I

    iput v0, p0, Landroidx/recyclerview/widget/k;->L:I

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v8

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/k;->O:I

    iput p1, p0, Landroidx/recyclerview/widget/k;->M:I

    goto/16 :goto_3

    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->f()V

    goto/16 :goto_3

    :cond_b
    iget v2, p0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-gez v2, :cond_c

    const-string p1, "Error processing scroll; pointer index for id "

    invoke-static {p1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RecyclerView"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    add-float/2addr v4, v8

    float-to-int v4, v4

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v8

    float-to-int p1, p1

    iget v2, p0, Landroidx/recyclerview/widget/k;->I:I

    if-eq v2, v5, :cond_14

    iget v2, p0, Landroidx/recyclerview/widget/k;->L:I

    sub-int v2, v4, v2

    iget v6, p0, Landroidx/recyclerview/widget/k;->M:I

    sub-int v6, p1, v6

    if-eqz v0, :cond_d

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v2, p0, Landroidx/recyclerview/widget/k;->P:I

    if-le v0, v2, :cond_d

    iput v4, p0, Landroidx/recyclerview/widget/k;->N:I

    move v0, v5

    goto :goto_2

    :cond_d
    move v0, v1

    :goto_2
    if-eqz v3, :cond_e

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v3, p0, Landroidx/recyclerview/widget/k;->P:I

    if-le v2, v3, :cond_e

    iput p1, p0, Landroidx/recyclerview/widget/k;->O:I

    move v0, v5

    :cond_e
    if-eqz v0, :cond_14

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    goto :goto_3

    :cond_f
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->a(I)V

    goto :goto_3

    :cond_10
    iget-boolean v2, p0, Landroidx/recyclerview/widget/k;->v:Z

    if-eqz v2, :cond_11

    iput-boolean v1, p0, Landroidx/recyclerview/widget/k;->v:Z

    :cond_11
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    add-float/2addr v2, v8

    float-to-int v2, v2

    iput v2, p0, Landroidx/recyclerview/widget/k;->N:I

    iput v2, p0, Landroidx/recyclerview/widget/k;->L:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    add-float/2addr p1, v8

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/k;->O:I

    iput p1, p0, Landroidx/recyclerview/widget/k;->M:I

    iget p1, p0, Landroidx/recyclerview/widget/k;->I:I

    if-ne p1, v7, :cond_12

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    :cond_12
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->o0:[I

    aput v1, p1, v5

    aput v1, p1, v1

    if-eqz v3, :cond_13

    or-int/lit8 v0, v0, 0x2

    :cond_13
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/k;->K(II)Z

    :cond_14
    :goto_3
    iget p1, p0, Landroidx/recyclerview/widget/k;->I:I

    if-ne p1, v5, :cond_15

    move v1, v5

    :cond_15
    return v1
.end method

.method public onLayout(ZIIII)V
    .locals 0

    sget p1, La0/a;->a:I

    const-string p1, "RV OnLayout"

    .line 1
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->k()V

    .line 3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->r:Z

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/k;->j(II)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    .line 1
    iget-object v0, v0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/k;->j(II)V

    return-void

    .line 2
    :cond_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/k;->j(II)V

    return-void

    :cond_2
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    iget-boolean v2, v1, Landroidx/recyclerview/widget/k$s;->h:Z

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void

    :cond_3
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->J()V

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    .line 5
    iget-object v1, v1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/k;->j(II)V

    .line 6
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->L(Z)V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    iput-boolean v0, p1, Landroidx/recyclerview/widget/k$s;->e:Z

    return-void
.end method

.method public onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/recyclerview/widget/k$r;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Landroidx/recyclerview/widget/k$r;

    iput-object p1, p0, Landroidx/recyclerview/widget/k;->c:Landroidx/recyclerview/widget/k$r;

    .line 1
    iget-object p1, p1, Li0/a;->a:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->c:Landroidx/recyclerview/widget/k$r;

    iget-object v0, v0, Landroidx/recyclerview/widget/k$r;->c:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k$j;->F(Landroid/os/Parcelable;)V

    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/k$r;

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/k$r;-><init>(Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->c:Landroidx/recyclerview/widget/k$r;

    if-eqz v1, :cond_0

    .line 1
    iget-object v1, v1, Landroidx/recyclerview/widget/k$r;->c:Landroid/os/Parcelable;

    iput-object v1, v0, Landroidx/recyclerview/widget/k$r;->c:Landroid/os/Parcelable;

    goto :goto_1

    .line 2
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/k$j;->G()Landroid/os/Parcelable;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Landroidx/recyclerview/widget/k$r;->c:Landroid/os/Parcelable;

    :goto_1
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->x()V

    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, Landroidx/recyclerview/widget/k;->u:Z

    const/4 v3, 0x0

    if-nez v2, :cond_2e

    iget-boolean v2, v0, Landroidx/recyclerview/widget/k;->v:Z

    if-eqz v2, :cond_0

    goto/16 :goto_10

    .line 1
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    iget-object v4, v0, Landroidx/recyclerview/widget/k;->o:Landroidx/recyclerview/widget/k$m;

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    const/4 v7, 0x0

    if-nez v2, :cond_1

    iput-object v7, v0, Landroidx/recyclerview/widget/k;->o:Landroidx/recyclerview/widget/k$m;

    goto :goto_0

    :cond_1
    invoke-interface {v4, v0, v1}, Landroidx/recyclerview/widget/k$m;->c(Landroidx/recyclerview/widget/k;Landroid/view/MotionEvent;)V

    if-eq v2, v5, :cond_3

    if-ne v2, v6, :cond_4

    goto :goto_2

    :cond_2
    :goto_0
    if-eqz v2, :cond_6

    iget-object v2, v0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_6

    iget-object v7, v0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/k$m;

    invoke-interface {v7, v0, v1}, Landroidx/recyclerview/widget/k$m;->b(Landroidx/recyclerview/widget/k;Landroid/view/MotionEvent;)Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_3
    :goto_2
    iput-object v7, v0, Landroidx/recyclerview/widget/k;->o:Landroidx/recyclerview/widget/k$m;

    :cond_4
    move v2, v6

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    move v2, v3

    :goto_3
    if-eqz v2, :cond_7

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/k;->f()V

    return v6

    :cond_7
    iget-object v2, v0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v2, :cond_8

    return v3

    :cond_8
    invoke-virtual {v2}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v2

    iget-object v4, v0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v4

    iget-object v7, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    if-nez v7, :cond_9

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v7

    iput-object v7, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    :cond_9
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v9

    if-nez v8, :cond_a

    iget-object v10, v0, Landroidx/recyclerview/widget/k;->o0:[I

    aput v3, v10, v6

    aput v3, v10, v3

    :cond_a
    iget-object v10, v0, Landroidx/recyclerview/widget/k;->o0:[I

    aget v11, v10, v3

    int-to-float v11, v11

    aget v10, v10, v6

    int-to-float v10, v10

    invoke-virtual {v7, v11, v10}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/high16 v10, 0x3f000000    # 0.5f

    if-eqz v8, :cond_2a

    const-string v11, "RecyclerView"

    const/4 v12, 0x2

    if-eq v8, v6, :cond_19

    if-eq v8, v12, :cond_e

    if-eq v8, v5, :cond_d

    const/4 v2, 0x5

    if-eq v8, v2, :cond_c

    const/4 v2, 0x6

    if-eq v8, v2, :cond_b

    goto/16 :goto_f

    :cond_b
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/k;->C(Landroid/view/MotionEvent;)V

    goto/16 :goto_f

    :cond_c
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    add-float/2addr v2, v10

    float-to-int v2, v2

    iput v2, v0, Landroidx/recyclerview/widget/k;->N:I

    iput v2, v0, Landroidx/recyclerview/widget/k;->L:I

    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v1, v1

    iput v1, v0, Landroidx/recyclerview/widget/k;->O:I

    iput v1, v0, Landroidx/recyclerview/widget/k;->M:I

    goto/16 :goto_f

    :cond_d
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/k;->f()V

    goto/16 :goto_f

    :cond_e
    iget v5, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v5

    if-gez v5, :cond_f

    const-string v1, "Error processing scroll; pointer index for id "

    invoke-static {v1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_f
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    add-float/2addr v8, v10

    float-to-int v8, v8

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v1, v1

    iget v5, v0, Landroidx/recyclerview/widget/k;->N:I

    sub-int/2addr v5, v8

    iget v9, v0, Landroidx/recyclerview/widget/k;->O:I

    sub-int v15, v9, v1

    iget-object v12, v0, Landroidx/recyclerview/widget/k;->n0:[I

    iget-object v13, v0, Landroidx/recyclerview/widget/k;->m0:[I

    const/4 v14, 0x0

    .line 3
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v9

    move v10, v5

    move v11, v15

    invoke-virtual/range {v9 .. v14}, Le0/g;->c(II[I[II)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 4
    iget-object v9, v0, Landroidx/recyclerview/widget/k;->n0:[I

    aget v10, v9, v3

    sub-int/2addr v5, v10

    aget v9, v9, v6

    sub-int/2addr v15, v9

    iget-object v9, v0, Landroidx/recyclerview/widget/k;->m0:[I

    aget v10, v9, v3

    int-to-float v10, v10

    aget v9, v9, v6

    int-to-float v9, v9

    invoke-virtual {v7, v10, v9}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget-object v9, v0, Landroidx/recyclerview/widget/k;->o0:[I

    aget v10, v9, v3

    iget-object v11, v0, Landroidx/recyclerview/widget/k;->m0:[I

    aget v12, v11, v3

    add-int/2addr v10, v12

    aput v10, v9, v3

    aget v10, v9, v6

    aget v11, v11, v6

    add-int/2addr v10, v11

    aput v10, v9, v6

    :cond_10
    iget v9, v0, Landroidx/recyclerview/widget/k;->I:I

    if-eq v9, v6, :cond_15

    if-eqz v2, :cond_12

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v9

    iget v10, v0, Landroidx/recyclerview/widget/k;->P:I

    if-le v9, v10, :cond_12

    if-lez v5, :cond_11

    sub-int/2addr v5, v10

    goto :goto_4

    :cond_11
    add-int/2addr v5, v10

    :goto_4
    move v9, v6

    goto :goto_5

    :cond_12
    move v9, v3

    :goto_5
    if-eqz v4, :cond_14

    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v11, v0, Landroidx/recyclerview/widget/k;->P:I

    if-le v10, v11, :cond_14

    if-lez v15, :cond_13

    sub-int/2addr v15, v11

    goto :goto_6

    :cond_13
    add-int/2addr v15, v11

    :goto_6
    move v9, v6

    :cond_14
    if-eqz v9, :cond_15

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    :cond_15
    iget v9, v0, Landroidx/recyclerview/widget/k;->I:I

    if-ne v9, v6, :cond_2c

    iget-object v9, v0, Landroidx/recyclerview/widget/k;->m0:[I

    aget v10, v9, v3

    sub-int/2addr v8, v10

    iput v8, v0, Landroidx/recyclerview/widget/k;->N:I

    aget v8, v9, v6

    sub-int/2addr v1, v8

    iput v1, v0, Landroidx/recyclerview/widget/k;->O:I

    if-eqz v2, :cond_16

    move v1, v5

    goto :goto_7

    :cond_16
    move v1, v3

    :goto_7
    if-eqz v4, :cond_17

    move v2, v15

    goto :goto_8

    :cond_17
    move v2, v3

    :goto_8
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/k;->G(IILandroid/view/MotionEvent;)Z

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    if-eqz v1, :cond_2c

    if-nez v5, :cond_18

    if-eqz v15, :cond_2c

    :cond_18
    invoke-virtual {v1, v0, v5, v15}, Landroidx/recyclerview/widget/e;->a(Landroidx/recyclerview/widget/k;II)V

    goto/16 :goto_f

    :cond_19
    iget-object v1, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    const/16 v5, 0x3e8

    iget v8, v0, Landroidx/recyclerview/widget/k;->R:I

    int-to-float v8, v8

    invoke-virtual {v1, v5, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    const/4 v1, 0x0

    if-eqz v2, :cond_1a

    iget-object v2, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    iget v5, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v2

    neg-float v2, v2

    goto :goto_9

    :cond_1a
    move v2, v1

    :goto_9
    if-eqz v4, :cond_1b

    iget-object v4, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    iget v5, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual {v4, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v4

    neg-float v4, v4

    goto :goto_a

    :cond_1b
    move v4, v1

    :goto_a
    cmpl-float v5, v2, v1

    if-nez v5, :cond_1c

    cmpl-float v1, v4, v1

    if-eqz v1, :cond_28

    :cond_1c
    float-to-int v1, v2

    float-to-int v2, v4

    .line 5
    iget-object v4, v0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v4, :cond_1d

    const-string v1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v11, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_d

    :cond_1d
    iget-boolean v5, v0, Landroidx/recyclerview/widget/k;->u:Z

    if-eqz v5, :cond_1e

    goto/16 :goto_d

    :cond_1e
    invoke-virtual {v4}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v4

    iget-object v5, v0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v5

    if-eqz v4, :cond_1f

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v8

    iget v9, v0, Landroidx/recyclerview/widget/k;->Q:I

    if-ge v8, v9, :cond_20

    :cond_1f
    move v1, v3

    :cond_20
    if-eqz v5, :cond_21

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v8

    iget v9, v0, Landroidx/recyclerview/widget/k;->Q:I

    if-ge v8, v9, :cond_22

    :cond_21
    move v2, v3

    :cond_22
    if-nez v1, :cond_23

    if-nez v2, :cond_23

    goto :goto_d

    :cond_23
    int-to-float v8, v1

    int-to-float v9, v2

    invoke-virtual {v0, v8, v9}, Landroidx/recyclerview/widget/k;->dispatchNestedPreFling(FF)Z

    move-result v10

    if-nez v10, :cond_27

    if-nez v4, :cond_25

    if-eqz v5, :cond_24

    goto :goto_b

    :cond_24
    move v10, v3

    goto :goto_c

    :cond_25
    :goto_b
    move v10, v6

    :goto_c
    invoke-virtual {v0, v8, v9, v10}, Landroidx/recyclerview/widget/k;->dispatchNestedFling(FFZ)Z

    if-eqz v10, :cond_27

    if-eqz v5, :cond_26

    or-int/lit8 v4, v4, 0x2

    :cond_26
    invoke-virtual {v0, v4, v6}, Landroidx/recyclerview/widget/k;->K(II)Z

    iget v4, v0, Landroidx/recyclerview/widget/k;->R:I

    neg-int v5, v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v16

    iget v1, v0, Landroidx/recyclerview/widget/k;->R:I

    neg-int v4, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v17

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->V:Landroidx/recyclerview/widget/k$u;

    .line 6
    iget-object v2, v1, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v2, v12}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    iput v3, v1, Landroidx/recyclerview/widget/k$u;->c:I

    iput v3, v1, Landroidx/recyclerview/widget/k$u;->b:I

    iget-object v13, v1, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/high16 v18, -0x80000000

    const v19, 0x7fffffff

    const/high16 v20, -0x80000000

    const v21, 0x7fffffff

    invoke-virtual/range {v13 .. v21}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    invoke-virtual {v1}, Landroidx/recyclerview/widget/k$u;->a()V

    move v1, v6

    goto :goto_e

    :cond_27
    :goto_d
    move v1, v3

    :goto_e
    if-nez v1, :cond_29

    .line 7
    :cond_28
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    :cond_29
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/k;->F()V

    move v3, v6

    goto :goto_f

    :cond_2a
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    iput v5, v0, Landroidx/recyclerview/widget/k;->J:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    add-float/2addr v5, v10

    float-to-int v5, v5

    iput v5, v0, Landroidx/recyclerview/widget/k;->N:I

    iput v5, v0, Landroidx/recyclerview/widget/k;->L:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v1, v1

    iput v1, v0, Landroidx/recyclerview/widget/k;->O:I

    iput v1, v0, Landroidx/recyclerview/widget/k;->M:I

    if-eqz v4, :cond_2b

    or-int/lit8 v2, v2, 0x2

    :cond_2b
    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/k;->K(II)Z

    :cond_2c
    :goto_f
    if-nez v3, :cond_2d

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->K:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_2d
    invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V

    return v6

    :cond_2e
    :goto_10
    return v3
.end method

.method public p()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/k$f;->a(Landroidx/recyclerview/widget/k;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v2

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method public q()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/k$f;->a(Landroidx/recyclerview/widget/k;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 2

    const-string v0, " "

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Landroid/view/View;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adapter:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layout:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", context:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public removeDetachedView(Landroid/view/View;Z)V
    .locals 2

    invoke-static {p1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit16 v1, v1, -0x101

    iput v1, v0, Landroidx/recyclerview/widget/k$v;->f:I

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Called removeDetachedView with a view which is not flagged as tmp detached."

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {p0, p2}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 3
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    .line 4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->y()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/k;->E(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    .line 1
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/k$j;->M(Landroidx/recyclerview/widget/k;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/k$m;

    invoke-interface {v2, p1}, Landroidx/recyclerview/widget/k$m;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public requestLayout()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->s:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->t:Z

    :goto_0
    return-void
.end method

.method public s(Landroid/view/View;)Landroid/view/View;
    .locals 2

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    move-object p1, v0

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_0
    if-ne v0, p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public scrollBy(II)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v0, :cond_0

    const-string p1, "RecyclerView"

    const-string p2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_5

    :cond_2
    const/4 v2, 0x0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move p1, v2

    :goto_0
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move p2, v2

    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/k;->G(IILandroid/view/MotionEvent;)Z

    :cond_5
    return-void
.end method

.method public scrollTo(II)V
    .locals 0

    const-string p1, "RecyclerView"

    const-string p2, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    .line 3
    :goto_1
    iget v0, p0, Landroidx/recyclerview/widget/k;->w:I

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/k;->w:I

    const/4 v1, 0x1

    :cond_2
    if-eqz v1, :cond_3

    return-void

    .line 4
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public setAccessibilityDelegateCompat(Landroidx/recyclerview/widget/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/k;->i0:Landroidx/recyclerview/widget/n;

    invoke-static {p0, p1}, Le0/m;->f(Landroid/view/View;Le0/a;)V

    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/k$d;)V
    .locals 5

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->setLayoutFrozen(Z)V

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->D()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    .line 2
    iget-object v1, v0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/a;->d(Ljava/util/List;)V

    iget-object v1, v0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/a;->d(Ljava/util/List;)V

    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->b()V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->d()Landroidx/recyclerview/widget/k$o;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget v1, v0, Landroidx/recyclerview/widget/k$o;->b:I

    if-nez v1, :cond_0

    move v1, p1

    .line 6
    :goto_0
    iget-object v2, v0, Landroidx/recyclerview/widget/k$o;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Landroidx/recyclerview/widget/k$o;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/k$o$a;

    iget-object v2, v2, Landroidx/recyclerview/widget/k$o$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/k$s;->d:Z

    .line 8
    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->z:Z

    or-int/2addr v0, p1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k;->z:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/k;->y:Z

    .line 9
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->e()I

    move-result v0

    move v1, p1

    :goto_1
    const/4 v2, 0x6

    if-ge v1, v0, :cond_2

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/b;->d(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$v;->p()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/k$v;->b(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->z()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 10
    iget-object v1, v0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_2
    if-ge p1, v1, :cond_4

    iget-object v3, v0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/k$v;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/k$v;->b(I)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/k$v;->a(Ljava/lang/Object;)V

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_4
    iget-object p1, v0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->e()V

    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->requestLayout()V

    return-void
.end method

.method public setChildDrawingOrderCallback(Landroidx/recyclerview/widget/k$e;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->j0:Landroidx/recyclerview/widget/k$e;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->j0:Landroidx/recyclerview/widget/k$e;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->g:Z

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->x()V

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->g:Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/k;->r:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->requestLayout()V

    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(Landroidx/recyclerview/widget/k$f;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->C:Landroidx/recyclerview/widget/k$f;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->x()V

    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->q:Z

    return-void
.end method

.method public setItemAnimator(Landroidx/recyclerview/widget/k$g;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$g;->d()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    const/4 v1, 0x0

    .line 1
    iput-object v1, v0, Landroidx/recyclerview/widget/k$g;->a:Landroidx/recyclerview/widget/k$g$b;

    .line 2
    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->g0:Landroidx/recyclerview/widget/k$g$b;

    .line 3
    iput-object v0, p1, Landroidx/recyclerview/widget/k$g;->a:Landroidx/recyclerview/widget/k$g$b;

    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 1
    iput p1, v0, Landroidx/recyclerview/widget/k$p;->e:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->l()V

    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 9

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->u:Z

    if-eq p1, v0, :cond_2

    const-string v0, "Do not setLayoutFrozen in layout or scroll"

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->e(Ljava/lang/String;)V

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->u:Z

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->t:Z

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v1, v3

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->u:Z

    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->v:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->M()V

    :cond_2
    :goto_0
    return-void
.end method

.method public setLayoutManager(Landroidx/recyclerview/widget/k$j;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->M()V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$g;->d()V

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/k$j;->I(Landroidx/recyclerview/widget/k$p;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/k$j;->J(Landroidx/recyclerview/widget/k$p;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->b()V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->p:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget-object v2, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 1
    iput-boolean v1, v0, Landroidx/recyclerview/widget/k$j;->f:Z

    invoke-virtual {v0, p0, v2}, Landroidx/recyclerview/widget/k$j;->B(Landroidx/recyclerview/widget/k;Landroidx/recyclerview/widget/k$p;)V

    .line 2
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/k$j;->O(Landroidx/recyclerview/widget/k;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$p;->b()V

    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    .line 3
    iget-object v2, v0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    const-wide/16 v3, 0x0

    .line 4
    iput-wide v3, v2, Landroidx/recyclerview/widget/b$a;->a:J

    iget-object v2, v2, Landroidx/recyclerview/widget/b$a;->b:Landroidx/recyclerview/widget/b$a;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/recyclerview/widget/b$a;->f()V

    .line 5
    :cond_4
    iget-object v2, v0, Landroidx/recyclerview/widget/b;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_6

    iget-object v3, v0, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    iget-object v4, v0, Landroidx/recyclerview/widget/b;->c:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    check-cast v3, Landroidx/recyclerview/widget/l;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {v4}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v3, v3, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    .line 7
    iget v5, v4, Landroidx/recyclerview/widget/k$v;->l:I

    invoke-virtual {v3, v4, v5}, Landroidx/recyclerview/widget/k;->H(Landroidx/recyclerview/widget/k$v;I)Z

    iput v1, v4, Landroidx/recyclerview/widget/k$v;->l:I

    .line 8
    :cond_5
    iget-object v3, v0, Landroidx/recyclerview/widget/b;->c:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    iget-object v0, v0, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v0, Landroidx/recyclerview/widget/l;

    .line 9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->b()I

    move-result v2

    :goto_2
    if-ge v1, v2, :cond_7

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/l;->a(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, v0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-static {v3}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    .line 11
    invoke-virtual {v3}, Landroid/view/View;->clearAnimation()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    iget-object v0, v0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 12
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz p1, :cond_9

    iget-object v0, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-nez v0, :cond_8

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/k$j;->O(Landroidx/recyclerview/widget/k;)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/k;->p:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Landroidx/recyclerview/widget/k$j;->f:Z

    goto :goto_3

    .line 14
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LayoutManager "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already attached to a RecyclerView:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-static {p1, v1}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_3
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$p;->l()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->requestLayout()V

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    .line 1
    iget-boolean v1, v0, Le0/g;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Le0/g;->c:Landroid/view/View;

    sget-object v2, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 2
    invoke-virtual {v1}, Landroid/view/View;->stopNestedScroll()V

    .line 3
    :cond_0
    iput-boolean p1, v0, Le0/g;->d:Z

    return-void
.end method

.method public setOnFlingListener(Landroidx/recyclerview/widget/k$l;)V
    .locals 0

    return-void
.end method

.method public setOnScrollListener(Landroidx/recyclerview/widget/k$n;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Landroidx/recyclerview/widget/k;->c0:Landroidx/recyclerview/widget/k$n;

    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/k;->U:Z

    return-void
.end method

.method public setRecycledViewPool(Landroidx/recyclerview/widget/k$o;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    if-eqz v1, :cond_0

    .line 2
    iget v2, v1, Landroidx/recyclerview/widget/k$o;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Landroidx/recyclerview/widget/k$o;->b:I

    .line 3
    :cond_0
    iput-object p1, v0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    if-eqz p1, :cond_1

    iget-object p1, v0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getAdapter()Landroidx/recyclerview/widget/k$d;

    :cond_1
    return-void
.end method

.method public setRecyclerListener(Landroidx/recyclerview/widget/k$q;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/k;->l:Landroidx/recyclerview/widget/k$q;

    return-void
.end method

.method public setScrollState(I)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/k;->I:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/k;->I:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->V:Landroidx/recyclerview/widget/k$u;

    .line 2
    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 3
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$j;->H(I)V

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/k;->d0:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d0:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$n;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setScrollingTouchSlop(): bad argument constant "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; using default value"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "RecyclerView"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    :goto_1
    iput p1, p0, Landroidx/recyclerview/widget/k;->P:I

    return-void
.end method

.method public setViewCacheExtension(Landroidx/recyclerview/widget/k$t;)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Le0/g;->h(II)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Le0/g;->i(I)V

    return-void
.end method

.method public t(Landroidx/recyclerview/widget/k$v;)I
    .locals 6

    const/16 v0, 0x20c

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k$v;->f(I)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    iget p1, p1, Landroidx/recyclerview/widget/k$v;->a:I

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_9

    iget-object v3, v0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/a$b;

    iget v4, v3, Landroidx/recyclerview/widget/a$b;->a:I

    const/4 v5, 0x1

    if-eq v4, v5, :cond_6

    const/4 v5, 0x2

    if-eq v4, v5, :cond_4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    iget v4, v3, Landroidx/recyclerview/widget/a$b;->b:I

    if-ne v4, p1, :cond_2

    iget p1, v3, Landroidx/recyclerview/widget/a$b;->d:I

    goto :goto_1

    :cond_2
    if-ge v4, p1, :cond_3

    add-int/lit8 p1, p1, -0x1

    :cond_3
    iget v3, v3, Landroidx/recyclerview/widget/a$b;->d:I

    if-gt v3, p1, :cond_7

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_4
    iget v4, v3, Landroidx/recyclerview/widget/a$b;->b:I

    if-gt v4, p1, :cond_7

    iget v3, v3, Landroidx/recyclerview/widget/a$b;->d:I

    add-int/2addr v4, v3

    if-le v4, p1, :cond_5

    goto :goto_2

    :cond_5
    sub-int/2addr p1, v3

    goto :goto_1

    :cond_6
    iget v4, v3, Landroidx/recyclerview/widget/a$b;->b:I

    if-gt v4, p1, :cond_7

    iget v3, v3, Landroidx/recyclerview/widget/a$b;->d:I

    add-int/2addr p1, v3

    :cond_7
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    :goto_2
    const/4 p1, -0x1

    :cond_9
    return p1
.end method

.method public v(I)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/k;->getScrollingChildHelper()Le0/g;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Le0/g;->f(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->r:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->G:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->E:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->F:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/k;->D:Landroid/widget/EdgeEffect;

    return-void
.end method

.method public y()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k;->A:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z()V
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->e()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/b;->d(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/k$k;

    const/4 v4, 0x1

    iput-boolean v4, v3, Landroidx/recyclerview/widget/k$k;->b:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    .line 1
    iget-object v2, v0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_1

    return-void

    :cond_1
    iget-object v0, v0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$v;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    throw v0
.end method
