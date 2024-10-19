.class public Lh/x$a;
.super Lw/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/x;->l(Landroid/content/Context;Lh/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/ref/WeakReference;

.field public final synthetic d:Lh/x;


# direct methods
.method public constructor <init>(Lh/x;IILjava/lang/ref/WeakReference;)V
    .locals 0

    iput-object p1, p0, Lh/x$a;->d:Lh/x;

    iput p2, p0, Lh/x$a;->a:I

    iput p3, p0, Lh/x$a;->b:I

    iput-object p4, p0, Lh/x$a;->c:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lw/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Typeface;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    iget v0, p0, Lh/x$a;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v1, p0, Lh/x$a;->b:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lh/x$a;->d:Lh/x;

    iget-object v1, p0, Lh/x$a;->c:Ljava/lang/ref/WeakReference;

    .line 1
    iget-boolean v2, v0, Lh/x;->m:Z

    if-eqz v2, :cond_2

    iput-object p1, v0, Lh/x;->l:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_2

    iget v0, v0, Lh/x;->j:I

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_2
    return-void
.end method
