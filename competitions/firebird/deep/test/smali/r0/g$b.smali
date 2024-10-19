.class public Lr0/g$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Ljava/lang/String;

.field public c:Lr0/o;

.field public d:Lr0/y;

.field public e:Lr0/g;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Lr0/g;Lr0/y;Lr0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/g$b;->a:Landroid/view/View;

    iput-object p2, p0, Lr0/g$b;->b:Ljava/lang/String;

    iput-object p5, p0, Lr0/g$b;->c:Lr0/o;

    iput-object p4, p0, Lr0/g$b;->d:Lr0/y;

    iput-object p3, p0, Lr0/g$b;->e:Lr0/g;

    return-void
.end method
